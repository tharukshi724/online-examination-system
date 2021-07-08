<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/11/2021
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Final.css">
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
                        <div class="side-nav__text">Create Final</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="FinalPaper.jsp" class="side-nav__link">
                        <i class="tasks icon side-nav__icon"></i>
                        <div class="side-nav__text">Final Paper</div>
                    </a>
                </li>

            </ul>

            <div class="legal">
                &copy; 2021 by ExamFever. All rights reserved.
            </div>
        </div>

        <div class="main-content">
 <h2>Add Final paper questions here</h2>

            <div class="container1">
                <form method="post" action="<%=request.getContextPath()%>/FinalAddServlet">
                    <div class="form-field">
                        <input type="text" name="fexamId" placeholder="Enter examId">
                    </div>
                    <div class="form-field">
                        <input type="text" name="subject" placeholder="Enter subject">
                    </div>
                    <div class="form-field">
                        <textarea name="fquestion" placeholder="Enter Question"></textarea>
                    </div>
                    <div class="form-field">
                        <textarea  name="fcorrectAns" placeholder="Enter Answer"></textarea>
                    </div>




                    <button class="button">Submit</button>

                </form>
            </div>


</body>
</html>
