<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Play Video</title>
    <style>
        .container {
            width: 80%;
            margin: auto;
            text-align: center;
            font-family: Arial, sans-serif;
            position: relative;
        }
        video {
            width: 70%;
            height: auto;
            border: 1px solid #ccc;
        }
        .button-container {
            position: fixed;
            bottom: 20px;
            width: 100%;
            display: flex;
            justify-content: space-between;
            padding: 0 30px;
        }
        .button {
            padding: 10px 20px;
            background-color: #0f988e;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .button:hover {
            background-color: #0a6e6b;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>VIDEO PLAYING</h2>

        <c:if test="${not empty videoName}">
            <video id="videoPlayer" controls>
                <source src="${pageContext.request.contextPath}/syllabus/video/play/stream?videoName=${videoName}" type="video/mp4">
                Your browser does not support the video tag.
            </video>
        </c:if>

        <div class="button-container">
            <!-- Back button at bottom left -->
            <a href="${pageContext.request.contextPath}/home/courses" class="button">Back</a>

			<!-- Back button at bottom left -->
			<a href="http://localhost:8080/syllabus/1/videos" class="button">Back</a>
        </div>
    </div>
</body>
</html>
