package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.module.CourseBean;
import com.example.demo.module.SyllabusBean;

@Repository
public interface SyllabusRepo extends JpaRepository<SyllabusBean, Integer>{
	List<SyllabusBean> findByCourse(CourseBean course);
    
    // Alternative method using JPQL query
    @Query("SELECT s FROM SyllabusBean s WHERE s.course.id = :courseId")
    List<SyllabusBean> findByCourseId(@Param("courseId") int courseId);

}
