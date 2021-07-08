<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 5/11/2021
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <title>Register Lecturer</title>
    <link rel="stylesheet" type = "text/css" href="styles/registerLecturer.css">

</head>

<body>

<div class="container">
    <div class="content">
        <div class="sidebar">
            <ul class="side-nav">

                <li class="side-nav__item side-nav__item--active">
                    <a href="Landing.jsp" class="side-nav__link">
                        <i class="car icon side-nav__icon"></i>
                        <div class="side-nav__text">Home</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="#" class="side-nav__link">
                        <i class="search icon side-nav__icon"></i>
                        <div class="side-nav__text">Add Lecturer</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="viewLecturer.jsp" class="side-nav__link">
                        <i class="tasks icon side-nav__icon"></i>
                        <div class="side-nav__text">Lecturers Details</div>
                    </a>
                </li>

            </ul>

            <div class="legal">
                &copy; 2021 by ExamFever. All rights reserved.
            </div>
        </div>

        <div class="main-content">
    <div class = "regform"><h1>Lecturer Registration Form</h1></div>
    <div class = "main">

        <form id="form" method = "post" action = "<%=request.getContextPath()%>/LecturerInsertServlet">

            <div class="form-control">

                <h2 class ="name">Staff Id</h2>
                <input class ="ID "type="text" name="staffId" placeholder="Enter Staff ID Number..">

                <h2 class ="name"> N.I.C</h2>
                <input class="NIC" type="text" name="NIC" placeholder="Enter N.I.C..">

                <h2 class ="name">Name</h2>
                <input class ="FullName" type ="text" name="name" placeholder ="Enter Name">

                <h2 class="name">Section</h2>
                <input class="Section" type="text" name="section" placeholder="Enter section..">

                <h2 class="name">E-Mail </h2>
                <input class="Email" type="text" name="email" placeholder="Enter email address..">

                <h2 class="name"> username</h2>
                <input class ="Username" type="text" name="username" placeholder="Enter username..">

                <h2 class="name">password</h2>
                <input class ="Password" type="password" name="password" placeholder="Enter password"><br>

                <center>
                    <button type ="submit"> Register</button>
                </center>
        </form>
    </div>
</div>
</div>
</div>

</body>
