<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Course Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: white;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: flex-start;
            padding-left: 5%;
        }

        .container {
            max-width: 500px;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            background-color: #ffffff;
            position: relative;
        }

        h2 {
            color: #333;
            font-size: 24px;
        }

        p {
            font-size: 16px;
            color: #555;
        }

        /* Universal Button Style */
        .button-32 {
            border-radius: 12px;
            cursor: pointer;
            font-weight: bold;
            padding: 8px 12px;
            text-align: center;
            transition: 200ms;
            box-sizing: border-box;
            border: 0;
            font-size: 14px;
            user-select: none;
            -webkit-user-select: none;
            touch-action: manipulation;
            display: inline-block;
            margin: 5px 0;
        }

        /* View Syllabus Button - Dark Blue */
        .view-syllabus {
            background-color: #1E3A8A;
            color: white;
        }

        .view-syllabus:hover {
            background-color: #152D6B;
        }

        /* Back to Courses - Bottom Left */
        .back-btn {
            position: fixed;
            bottom: 20px;
            left: 20px;
            background-color: #4C585B;
            color: white;
            border-radius: 12px;
            padding: 10px 20px;
            font-size: 14px;
            font-weight: bold;
            transition: all 0.3s ease;
            cursor: pointer;
            text-align: center;
            border: none;
        }

        .back-btn:hover {
            background-color: #3B484A;
            transform: scale(1.05);
        }

        /* Register Button - Green */
        .register-button {
            background-color: #28a745;
            padding: 10px 20px;
            color: white;
            border-radius: 12px;
            font-size: 14px;
            font-weight: bold;
            transition: all 0.3s ease;
            cursor: pointer;
            display: inline-block;
            text-align: center;
            position: absolute;
            bottom: 20px;
            right: 20px;
        }

        .register-button:hover {
            background-color: #218838;
            transform: scale(1.05);
        }

        /* Right Side Course Images */
        .course-images {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .course-images img {
            width: 400px;
            height: auto;
            border-radius: 10px;
            box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);
        }

    </style>
</head>
<body>
    
    <div class="container">
        <h2>Course Details</h2>
        <p><strong>ID:</strong> ${course.getCourseCode()}</p>
        <p><strong>Name:</strong> ${course.getName()}</p>
        <p><strong>Description:</strong> ${course.getDescription()}</p>
        <p><strong>Syllabus:</strong> ${course.getSyllabus()}</p>
        <p><strong>Duration:</strong> ${course.getDuration()} hours</p>
        <p><strong>Price:</strong> $${course.getPrice()}</p>
        <p><strong>Payment Mode:</strong> ${course.getPaymentMode()}</p>
        
        <!-- View Syllabus Button -->
        <button class="button-32 view-syllabus" onclick="window.location.href='${pageContext.request.contextPath}/home/courses/${course.getCourseid()}/syllabus'">View Syllabus</button>
        
        <!-- Register Button -->
        <a href="${pageContext.request.contextPath}/home/courses/${course.getCourseid()}/register" class="register-button">Register</a>
    </div>

    <!-- Right Side Course Images -->
    <div class="course-images">
        <img src="https://via.placeholder.com/400?text=Course+Image" alt="Course Image">
    </div>

    <!-- Back to Courses Button (Bottom Left) -->
    <button class="back-btn" onclick="window.location.href='${pageContext.request.contextPath}/home/courses'">Back to Courses</button>

</body>
</html>
