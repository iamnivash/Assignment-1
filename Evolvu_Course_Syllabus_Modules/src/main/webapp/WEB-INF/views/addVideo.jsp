<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Video Details</title>
    <style>
        .container {
            width: 50%;
            margin: auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.1);
            font-family: Arial, sans-serif;
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
            text-align: left;
        }
        label {
            font-weight: bold;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .button-17, .back-button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
            margin-top: 10px;
        }
        .button-17:hover {
            background-color: #45a049;
        }
        .back-button {
            background-color: #f44336;
        }
        .back-button:hover {
            background-color: #d32f2f;
        }
        .message {
            margin-bottom: 20px;
            padding: 10px;
            border-radius: 5px;
        }
        .success {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }
        .error {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Enter Video Details for Syllabus ID: ${syllabusId}</h2>

        <!-- Display Success or Error Message -->
        <c:if test="${not empty successMessage}">
            <div class="message success">
                <strong>${successMessage}</strong>
            </div>
        </c:if>
        <c:if test="${not empty errorMessage}">
            <div class="message error">
                <strong>${errorMessage}</strong>
            </div>
        </c:if>

        <!-- Video Details Form -->
        <form action="${pageContext.request.contextPath}/syllabus/addVideo" method="POST" accept-charset="UTF-8">
            <!-- Video Title -->
            <div class="form-group">
                <label for="video_title">Video Title:</label>
                <input type="text" id="video_title" name="video_title" required />
            </div>

            <!-- Video Name -->
            <div class="form-group">
                <label for="video_name">Video Name:</label>
                <input type="text" id="video_name" name="video_name" required />
            </div>

            <!-- Video URL (or Local Path) -->
            <div class="form-group">
                <label for="video_url">Video URL (or Local Path):</label>
                <input type="text" id="video_url" name="video_url" required />
            </div>

            <!-- Duration -->
            <div class="form-group">
                <label for="duration">Duration (minutes):</label>
                <input type="number" id="duration" name="duration" min="1" step="1" required />
            </div>

            <!-- Status -->
            <div class="form-group">
                <label for="status">Status:</label>
                <select id="status" name="status" required>
                    <option value="true">Active</option>
                    <option value="false">Inactive</option>
                </select>
            </div>

            <!-- Hidden Syllabus ID -->
            <input type="hidden" name="syllabusId" value="${syllabusId}" />

            <!-- Submit Button -->
            <button type="submit" class="button-17">Submit Video</button>
        </form>

        <!-- Back to Home Button -->
        <button class="back-button" onclick="location.href='${pageContext.request.contextPath}/home'">Back to Home</button>
    </div>

</body>
</html>
