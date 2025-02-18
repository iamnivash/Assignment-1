<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Syllabus List</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }
        
        .container {
            width: 100%;
            padding: 20px;
            box-sizing: border-box;
            text-align: center;
        }

        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px;
            background-color: #222;
            color: white;
            font-size: 20px;
            font-weight: bold;
            position: relative;
        }

        .header h1 {
            flex-grow: 1;
            text-align: center;
            font-family: 'Georgia', serif;
            font-size: 32px;
            margin: 0;
        }

        .course-info {
            position: absolute;
            right: 20px;
            font-size: 18px;
        }

        .syllabus-container {
            width: 80%;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: left;
        }

        .syllabus-content {
            font-size: 18px;
            margin-bottom: 10px;
        }

        .syllabus-duration {
            font-size: 16px;
            color: #666;
        }

        .btn-white-black {
            padding: 10px 20px;
            background-color: white;
            color: black;
            border: 2px solid black;
            font-weight: bold;
            cursor: pointer;
            border-radius: 5px;
            transition: 0.3s;
            display: inline-block;
            text-decoration: none;
            margin-top: 10px;
        }

        .btn-white-black:hover {
            background-color: black;
            color: white;
        }

        .back-link {
            display: block;
            margin-top: 20px;
            font-size: 16px;
        }
    </style>
</head>
<body>

    <div class="header">
        <h1>Syllabus</h1>
        <div class="course-info">
            ${syllabus.course.getName()} | ${syllabus.course.getCourseCode()}
        </div>
    </div>

    <div class="container">
        <c:forEach var="syllabus" items="${syllabusList}">
            <div class="syllabus-container">
                <div class="syllabus-content">${syllabus.syllabusContent}</div>
                <div class="syllabus-duration">${syllabus.duration} hours</div>
                <a href="${pageContext.request.contextPath}/syllabus/${syllabus.syllabusId}/videos" 
                   class="btn-white-black">
                    View Syllabus
                </a>
            </div>
        </c:forEach>

        <a href="${pageContext.request.contextPath}/home/courses" class="back-link">Back to Courses</a>
    </div>

</body>
</html>
