package com.example.demo;

import com.example.demo.module.SyllabusBean;
import com.example.demo.module.VideosBean;
import com.example.demo.repository.SyllabusRepo;
import com.example.demo.repository.VideoRepo;
import com.example.demo.service.VideoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/syllabus")
public class VideoController {

    @Autowired
    private VideoRepo videoRepository;

    
    @GetMapping("/{syllabusId}/videos")
    public String getVideosBySyllabus(@PathVariable int syllabusId, Model model) {
        List<VideosBean> videos = videoRepository.findBySyllabus_SyllabusId(syllabusId);
        model.addAttribute("videoList", videos);
        return "videosList";  // Forward to videosList.jsp
    }

    
    @GetMapping("/video/play")
    public String showVideoPage(@RequestParam String videoName, Model model) {
        model.addAttribute("videoName", videoName);
        return "videoPlay"; 
    }

   
    @GetMapping("/video/play/stream")
    public ResponseEntity<Resource> streamVideo(@RequestParam String videoName) {
        Optional<VideosBean> videoOptional = videoRepository.findByVideoName(videoName);

        if (videoOptional.isPresent()) {
            VideosBean video = videoOptional.get();
            String videoPath = video.getVideoUrl().replace("\\", "/") + "/" + video.getVideoName();

            try {
                Path path = Paths.get(videoPath);
                Resource resource = new UrlResource(path.toUri());

                if (resource.exists() && resource.isReadable()) {
                    return ResponseEntity.ok()
                            .contentType(MediaType.parseMediaType("video/mp4"))
                            .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + video.getVideoName() + "\"")
                            .body(resource);
                } else {
                    return ResponseEntity.notFound().build();
                }
            } catch (Exception e) {
                return ResponseEntity.internalServerError().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    @Autowired
    VideoService videoService;
    
    @GetMapping("/add")
    public String showAddVideoForm() {
        return "addVideoAskId";
    }
    
    @GetMapping("/addVideo")
    public String showAskSyllabusPage(@RequestParam("syllabusId") String syllabusId, Model model) {
        model.addAttribute("syllabusId", syllabusId);
        return "addVideo";
    }
    
    @Autowired
    SyllabusRepo syllabusRepository;
    @PostMapping("/addVideo")
    public String addVideo(@RequestParam("syllabusId") int syllabusId,
                           @RequestParam("video_title") String videoTitle,
                           @RequestParam("video_name") String videoName,
                           @RequestParam("video_url") String videoUrl,
                           @RequestParam("duration") int duration,
                           @RequestParam("status") boolean status,
                           Model model) {

        
        Optional<SyllabusBean> optionalSyllabus = syllabusRepository.findById(syllabusId);
        
        if (!optionalSyllabus.isPresent()) {
            model.addAttribute("errorMessage", "Invalid Syllabus ID. Cannot add video.");
            return "addVideo";
        }

        SyllabusBean syllabus = optionalSyllabus.get();

        
        VideosBean video = new VideosBean();
        video.setSyllabus(syllabus); 
        video.setVideoTitle(videoTitle);
        video.setVideoName(videoName);
        video.setVideoUrl(videoUrl);
        video.setDuration(duration);
        video.setStatus(status);

        
        try {
            videoRepository.save(video);
            model.addAttribute("successMessage", "Video successfully added!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to add video: " + e.getMessage());
        }

      
        model.addAttribute("syllabusId", syllabusId);
        return "addVideo";
    }
    
 
}
