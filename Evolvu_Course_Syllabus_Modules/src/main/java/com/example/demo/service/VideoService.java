package com.example.demo.service;

import com.example.demo.module.VideosBean;
import com.example.demo.repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private VideoRepo videoRepo;
    
    public void saveVideo(VideosBean video) {
        videoRepo.save(video);
    }

    


}
