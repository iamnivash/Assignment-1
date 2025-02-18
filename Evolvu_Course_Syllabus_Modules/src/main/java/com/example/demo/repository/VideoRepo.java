package com.example.demo.repository;

import com.example.demo.module.VideosBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepo extends JpaRepository<VideosBean, Integer> {
	Optional<VideosBean> findByVideoName(String videoName);

	List<VideosBean> findBySyllabus_SyllabusId(int syllabusId);
}
