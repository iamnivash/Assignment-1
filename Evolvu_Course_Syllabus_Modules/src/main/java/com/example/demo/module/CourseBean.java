package com.example.demo.module;


import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "Courses")
public class CourseBean {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id", nullable = false)
	private int courseid;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Duration", nullable = false)
    private int duration;
    
    @Column(name = "syllabus", nullable = false)
    private int syllabus;
    
    @Column(name = "Price", nullable = false)
    private double price;
    
    @Column(name = "syllabus_status", nullable = false)
    private boolean syllabusStatus;
    
    @Column(name = "Status", nullable = false)
    private boolean status;
    
    @Column(name = "Payment_Mode", nullable = false)
    private String paymentMode;
    
    @Column(name = "course_code", nullable = false)
    private String courseCode;
    
    

    // No-args constructor
    public CourseBean() {
    }

    // All-args constructor
    
    public CourseBean(String name, String description, int duration, int syllabus, double price, boolean syllabusStatus, boolean status, String paymentMode, String courseCode) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.syllabus = syllabus;
        this.price = price;
        this.syllabusStatus = syllabusStatus;
        this.status = status;
        this.paymentMode = paymentMode;
        this.courseCode = courseCode;
    }

    public int getCourseid() { return courseid; }
    public void setCourseid(int courseid) { this.courseid = courseid; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getSyllabus() { return syllabus; }
    public void setSyllabus(int syllabus) { this.syllabus = syllabus; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isSyllabusStatus() { return syllabusStatus; }
    public void setSyllabusStatus(boolean syllabusStatus) { this.syllabusStatus = syllabusStatus; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }
    
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String coursecode) { this.courseCode = coursecode; }

}