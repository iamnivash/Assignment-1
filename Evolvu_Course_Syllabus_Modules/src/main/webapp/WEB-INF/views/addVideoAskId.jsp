<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Syllabus ID</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        .container {
            width: 400px;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 0 auto;
            text-align: center;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

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
            width: 100%;
            margin-top: 20px;
        }

        .button-17:hover {
            background: #BBDEFB;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Enter Syllabus ID</h2>
        <form action="${pageContext.request.contextPath}/syllabus/addVideo" method="GET">
            <!-- Syllabus ID Input -->
            <div class="form-group">
                <label for="syllabusId">Syllabus ID:</label>
                <input type="text" id="syllabusId" name="syllabusId" required />
            </div>
            
            <!-- Submit Button -->
            <button type="submit" class="button-17">Next</button>
        </form>
    </div>

</body>
</html>
