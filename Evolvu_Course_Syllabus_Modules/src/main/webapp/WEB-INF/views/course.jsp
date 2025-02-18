<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Courses</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 30px;
            padding: 15px;
            background-color: #003366; /* Dark Blue for the header */
            color: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .logo {
            font-size: 24px;
            font-weight: bold;
            text-transform: uppercase;
            letter-spacing: 2px;
            font-family: 'Butler', serif;
            color: white;
        }
        .logo span {
            font-size: 40px;
            color: #ff6600; /* Orange */
            font-family: 'Butler', serif;
        }
        .title-container {
            flex-grow: 1;
            text-align: center;
        }
        h1 {
            color: #fff;
            margin: 0;
            font-size: 36px;
        }
        .search-container {
            position: relative;
            margin-right: 20px; /* Move search bar to the left */
        }
        .search-input {
            padding: 10px 15px;
            border: 2px solid #ff6600; /* Orange */
            border-radius: 20px;
            width: 250px;
            outline: none;
            transition: border-color 0.3s ease;
        }
        .search-input:focus {
            border-color: #003366; /* Dark Blue */
        }
        .search-btn {
            position: absolute;
            right: 8px;
            top: 50%;
            transform: translateY(-50%);
            background: none;
            border: none;
            cursor: pointer;
            transition: transform 0.3s ease;
        }
        .search-btn:hover {
            transform: translateY(-50%) scale(1.1);
        }
        .search-btn img {
            width: 20px;
        }
        .login-btn {
            background-color: #ff6600; /* Orange */
            border: none;
            border-radius: 20px;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.3s ease;
        }
        .login-btn:hover {
            background-color: #e65c00; /* Darker Orange */
            transform: scale(1.05);
        }
        .container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
        }
        .course-card {
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
            position: relative;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            min-height: 200px;
            background: #ffffff; /* White */
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }
        .course-card:hover {
            transform: scale(1.05);
            box-shadow: 0 10px 15px rgba(0, 0, 0, 0.2);
        }
        .course-card h3 {
            margin: 0;
            color: #003366; /* Dark Blue */
            font-size: 22px;
        }
        .course-card p {
            color: #666;
            font-size: 14px;
            margin-bottom: 20px;
        }
        .card-footer {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-top: auto;
        }
        .price {
            font-size: 18px;
            font-weight: bold;
            color: #2C3930; /* Dark Green */
        }
        .button-33 {
            background-color: #ff6600; /* Orange */
            border-radius: 100px;
            box-shadow: rgba(44, 187, 99, .2) 0 -25px 18px -14px inset, rgba(44, 187, 99, .15) 0 1px 2px, rgba(44, 187, 99, .15) 0 2px 4px, rgba(44, 187, 99, .15) 0 4px 8px, rgba(44, 187, 99, .15) 0 8px 16px, rgba(44, 187, 99, .15) 0 16px 32px;
            color: white;
            cursor: pointer;
            display: inline-block;
            font-family: CerebriSans-Regular,-apple-system,system-ui,Roboto,sans-serif;
            padding: 7px 20px;
            text-align: center;
            text-decoration: none;
            transition: all 250ms;
            border: 0;
            font-size: 16px;
            user-select: none;
            -webkit-user-select: none;
            touch-action: manipulation;
        }
        .button-33:hover {
            box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset, rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px, rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px, rgba(44, 187, 99, .25) 0 16px 32px;
            transform: scale(1.05) rotate(-1deg);
        }
        .back-btn {
            background-color: #4C585B; /* Dark Gray */
            border-radius: 100px;
            box-shadow: rgba(44, 187, 99, .2) 0 -25px 18px -14px inset, rgba(44, 187, 99, .15) 0 1px 2px, rgba(44, 187, 99, .15) 0 2px 4px, rgba(44, 187, 99, .15) 0 4px 8px, rgba(44, 187, 99, .15) 0 8px 16px, rgba(44, 187, 99, .15) 0 16px 32px;
            color: white;
            cursor: pointer;
            display: inline-block;
            font-family: CerebriSans-Regular, -apple-system, system-ui, Roboto, sans-serif;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            transition: all 250ms;
            border: 0;
            font-size: 16px;
            user-select: none;
            -webkit-user-select: none;
            touch-action: manipulation;
            margin-top: 20px;
        }
        .back-btn:hover {
            box-shadow: rgba(44, 187, 99, .35) 0 -25px 18px -14px inset, rgba(44, 187, 99, .25) 0 1px 2px, rgba(44, 187, 99, .25) 0 2px 4px, rgba(44, 187, 99, .25) 0 4px 8px, rgba(44, 187, 99, .25) 0 8px 16px, rgba(44, 187, 99, .25) 0 16px 32px;
            transform: scale(1.05) rotate(-1deg);
        }
    </style>
    <script>
        function searchCourses() {
            var input, filter, cards, title, i;
            input = document.getElementById("searchInput");
            filter = input.value.toUpperCase();
            cards = document.getElementsByClassName("course-card");

            for (i = 0; i < cards.length; i++) {
                title = cards[i].getElementsByTagName("h3")[0];
                if (title.innerHTML.toUpperCase().indexOf(filter) > -1) {
                    cards[i].style.display = "";
                } else {
                    cards[i].style.display = "none";
                }
            }
        }
    </script>
</head>
<body>
    <div class="header">
        <div class="logo">EVOLV<span style="color:#ff6600;">U</span></div>
        <div class="title-container">
            <h1>Available Courses</h1>
        </div>
        <div class="search-container">
            <input type="text" id="searchInput" class="search-input" onkeyup="searchCourses()" placeholder="Search courses...">
            <button class="search-btn">
                <img src="https://cdn-icons-png.flaticon.com/512/751/751463.png" alt="🔍">
            </button>
        </div>
        <button class="login-btn" onclick="window.location.href='/login'">Login</button>
    </div>

    <div class="container">
        <c:forEach var="course" items="${courses}">
            <div class="course-card">
                <h3>${course.getName()}</h3>
                <p>${course.getDescription()}</p>
                <div class="card-footer">
                    <span class="price">₹${course.getPrice()}</span>
                    <button class="button-33" onclick="window.location.href='/home/courses/${course.getCourseid()}'">Details</button>
                </div>
            </div>
        </c:forEach>
    </div>

    <a href="${pageContext.request.contextPath}/home" class="back-btn">Back to Home</a>
</body>
</html>