<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home - Course Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        .container {
            display: flex;
            justify-content: center;
            gap: 50px; /* Space between sections */
            margin-top: 50px;
        }

        .section {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px; /* Equal width for all sections */
            display: flex;
            flex-direction: column;
            align-items: center; /* Center buttons */
        }

        /* Button Styling */
        .button-17 {
            appearance: none;
            background-color: #E3F2FD;
            border-radius: 24px;
            border: none;
            box-shadow: rgba(0, 0, 0, .2) 0 3px 5px -1px,
                        rgba(0, 0, 0, .14) 0 6px 10px 0,
                        rgba(0, 0, 0, .12) 0 1px 18px 0;
            color: #0D47A1;
            cursor: pointer;
            font-size: 16px;
            font-weight: 500;
            height: 48px;
            padding: 10px 24px;
            text-align: center;
            text-decoration: none;
            width: 80%; /* Ensures button is centered */
            margin-top: 10px;
        }

        .button-17:hover {
            background: #BBDEFB;
        }

        .section-header {
            font-size: 20px;
            font-weight: bold;
            color: #333;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

    <h1>Welcome to Course Management</h1>

    <div class="container">
        
        <!-- Course Management Section -->
        <div class="section">
            <div class="section-header">Course Management</div>
            <a href="${pageContext.request.contextPath}/home/courses/add" class="button-17">Add Course</a>
            <a href="${pageContext.request.contextPath}/home/courses" class="button-17">View Courses</a>
            <a href="${pageContext.request.contextPath}/home/courses/update" class="button-17">Update Course</a>
            <a href="${pageContext.request.contextPath}/home/courses/delete" class="button-17">Delete Course</a>
        </div>

        <!-- Syllabus Management Section -->
        <div class="section">
            <div class="section-header">Syllabus Management</div>
            <a href="${pageContext.request.contextPath}/home/courses/syllabus/ask" class="button-17">Add Syllabus</a>
            <a href="${pageContext.request.contextPath}/home/courses/syllabus/update" class="button-17">Update Syllabus</a>
            <a href="${pageContext.request.contextPath}/home/courses/syllabus/delete" class="button-17">Delete Syllabus</a>
        </div>

        <!-- Video Management Section -->
        <div class="section">
            <div class="section-header">Video Management</div>
            <a href="${pageContext.request.contextPath}/syllabus/add" class="button-17">Add Video</a>
        </div>

    </div>

</body>
</html>
