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

                <form id="form" method = "post" action = "<%=request.getContextPath()%>/LecturerEditServlet">

                    <div class="form-control">

                        <input type="hidden" name="userId" value="<%=request.getAttribute("userId")%>">
                        <h2 class ="name">Staff Id</h2>
                        <input  type="text" class ="ID" name="staffId" value="<%=request.getAttribute("staffId")%>">

                        <h2 class ="name"> N.I.C</h2>
                        <input class="NIC" type="text" name="NIC" value="<%=request.getAttribute("NIC")%>">

                        <h2 class ="name">Name</h2>
                        <input class ="FullName" type ="text" name="name" value="<%=request.getAttribute("name")%>">

                        <h2 class="name">Section</h2>
                        <input class="Section" type="text" name="section" value="<%=request.getAttribute("section")%>">

                        <h2 class="name">E-Mail </h2>
                        <input class="Email" type="text" name="email" value="<%=request.getAttribute("email")%>">

                        <h2 class="name"> username</h2>
                        <input class ="Username" type="text" name="username" value="<%=request.getAttribute("username")%>">

                        <h2 class="name">password</h2>
                        <input class ="Password" type="password" name="password" value="<%=request.getAttribute("password")%>"><br>

                        <center>
                            <button type ="submit">Update</button>
                        </center>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
