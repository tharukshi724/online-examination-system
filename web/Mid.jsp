<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/11/2021
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%--ccc--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="mid.css">

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
                        <div class="side-nav__text">Create Mid Exam</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="Final.jsp" class="side-nav__link">
                        <i class="tasks icon side-nav__icon"></i>
                        <div class="side-nav__text">Create Final Exam</div>
                    </a>
                </li>


            </ul>

            <div class="legal">
                &copy; 2021 by ExamFever. All rights reserved.
            </div>
        </div>

        <div class="main-content">
            <h2>Add Mid Question</h2>
<div class="container1">
    <form method="post" class="form" onsubmit="return check()"  >

        <div class="form-field">
            <input type="text" name="examId" placeholder="Enter exam Id"  id="examId" >
        </div>
        <div class="form-field">
            <input type="text" name="subject" placeholder="Enter subject" required>
        </div>
        <div class="form-field">
            <textarea  name="question" placeholder="Enter question" required></textarea>
        </div>
        <div class="form-field">
             <textarea  name="ans1" placeholder="Enter answer 01" required></textarea>
        </div>
        <div class="form-field">
            <textarea  name="ans2" placeholder="Enter answer 02" required></textarea>
        </div>
        <div class="form-field">
             <textarea  name="ans3" placeholder="Enter answer 03" required></textarea>
        </div>
        <div class="form-field">
            <textarea  name="ans4" placeholder="Enter answer 04" required></textarea>
        </div>
        <div class="form-field">
             <textarea  name="correctAns" placeholder="Enter correct answer" required></textarea>
        </div>

        <button type="submit" class="button">Submit</button>
    </form>
</div>

        </div>
    </div>
</div>
<script src="mid.js"></script>
</body>
</html>
