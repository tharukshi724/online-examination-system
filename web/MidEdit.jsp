<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/11/2021
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%--ccc--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        :root {
            --color-primary: #eb2f64;
            --color-primary-light: #ff3366;
            --color-primary-dark: #ba265d;
            --color-grey-light-1: #faf9f9;
            --color-grey-light-2: #f4f2f2;
            --color-grey-light-3: #f0eeee;
            --color-grey-light-4: #ccc;
            --color-grey-dark-1: #333;
            --color-grey-dark-2: #777;
            --color-grey-dark-3: #999;
            --input-box-bg: #f5f5f5;
            --shadow-dark: 0 2rem 6rem rgba(0, 0, 0, 0.3);
            --shadow-light: 0 2rem 5rem rgba(0, 0, 0, 0.06);
            --line: 1px solid var(--color-grey-light-2);
        }

        * {
            margin: 0;
            padding: 0;
        }

        *,
        *::before,
        *::after {
            box-sizing: inherit;
        }

        html {
            box-sizing: border-box;
            font-size: 62.5%;
        }
        @media only screen and (max-width: 68.75em) {
            html {
                font-size: 50%;
            }
        }

        body {
            font-family: 'Open Sans', sans-serif;
            font-weight: 400;
            line-height: 1.6;
            color: var(--color-grey-dark-2);
            background-image: linear-gradient(to right bottom, #ff3366, #ba265d);
            background-size: cover;
            background-repeat:round;
            min-height: 100vh;
        }

        .container {
            max-width: 130rem;
            margin: 5rem auto;
            background-color: var(--color-grey-light-1);
            box-shadow: var(--shadow-dark);
            min-height: 70rem;
        }

        @media only screen and (max-width: 75em) {
            .container {
                margin: 0;
                max-width: 100%;
                width: 100%;
            }
        }

        .content {
            display: flex;
            overflow: hidden;
        }

        @media only screen and (max-width: 56.25em) {
            .content {
                flex-direction: column;
            }
        }

        /*************************************************
                    SIDE NAV BAR
        *************************************************/

        .sidebar {
            background-color: var(--color-grey-dark-1);
            flex: 0 0 18%;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            margin-right: 30px;
        }

        .main-content {
            /* background-color: #eb2f64; */
            flex: 1;
            overflow: hidden;
            height: auto;
            overflow: hidden;
        }

        .side-nav {
            font-size: 1.4rem;
            list-style: none;
            margin-top: 3.5rem;
        }

        @media only screen and (max-width: 56.25em) {
            .side-nav {
                display: flex;
                margin: 0;
            }
        }

        .side-nav__item {
            position: relative;
        }

        .side-nav__item:not(:last-child) {
            margin-bottom: 0.5rem;
        }

        @media only screen and (max-width: 56.25em) {
            .side-nav__item:not(:last-child) {
                margin: 0;
            }
        }

        @media only screen and (max-width: 56.25em) {
            .side-nav__item {
                flex: 1;
            }
        }

        .side-nav__item::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            width: 3px;
            background-color: var(--color-primary);
            transform: scaleY(0);
            transition: transform 0.2s, width 0.4s cubic-bezier(1, 0, 0, 1) 0.2s,
            background-color 0.1s;
        }

        .side-nav__item:hover::before,
        .side-nav__item--active::before {
            transform: scaleY(1);
            width: 100%;
        }

        .side-nav__item:active::before {
            background-color: var(--color-primary-light);
        }

        .side-nav__link:link,
        .side-nav__link:visited {
            color: var(--color-grey-light-1);
            text-decoration: none;
            text-transform: uppercase;
            align-items: center;
            padding: 1.5rem 3rem;
            z-index: 10;
            display: flex;
            align-items: center;
            position: relative;
        }

        @media only screen and (max-width: 56.25em) {
            .side-nav__link:link,
            .side-nav__link:visited {
                justify-content: center;
                padding: 2rem;
            }
        }

        @media only screen and (max-width: 37.5em) {
            .side-nav__link:link,
            .side-nav__link:visited {
                flex-direction: column;
                padding: 1.5rem 0.5rem;
            }
        }

        @media only screen and (max-width: 37.5em) {
            .side-nav__icon {
                margin-right: 0;
                margin-bottom: 0.7rem;
                width: 1.5rem;
                height: 1.5rem;
            }
        }

        .legal {
            font-size: 1.2rem;
            color: var(--color-grey-light-4);
            text-align: center;
            padding: 2.5rem;
        }

        @media only screen and (max-width: 56.25em) {
            .legal {
                display: none;
            }
        }

h3{
    color:palevioletred;
    font-family: Monospace;

}
        .container1{
            position: absolute;
            top:10%;
            width:250px;
            height:200px;
            margin:2px 40px 50px 160px;
            padding:20px 50px 50px 50px;

            box-shadow:rgba(red, green, blue, alpha)
        }
        .form{
            padding:30px 40px;
        }
        .form-field{


            margin-bottom:20px;
            padding-bottom:10px;
            position:relative;



        }
        .form-field input{
            border:2px solid #f0f0f0;
            border-radius:4px;

            align-items: center;
            padding:10px;

            width:700%;

        }
        .form-field input hover{

            border-color:blue;
        }
        .button{
            width:100%;
            height:30px;
            background-color: salmon;
            border:none;
            border-radius: 4px;
            color:wheat;
            font-family: 'Courier New', Courier, monospace;

        }
    </style>
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
            <h3>Edit Mid Question</h3>
<div class="container1">
    <form method="post" class="form" action="<%=request.getContextPath()%>/MidEditServlet">

        <input type ="hidden" name="questionId" value="<%=request.getAttribute("questionId")%>">
        <div class="form-field">
            <input  name="examId" value="<%=request.getAttribute("examId")%>" required>
        </div>
        <div class="form-field">
            <input  name="subject" value="<%=request.getAttribute("subject")%>" required>
        </div>
        <div class="form-field">
             <input type="text"  name="question" value="<%=request.getAttribute("question")%>" required>
        </div>
        <div class="form-field">
            <input type="text"  name="ans1" value="<%=request.getAttribute("ans1")%>" required>
        </div>
        <div class="form-field">
            <input type="text"   name="ans2" value="<%=request.getAttribute("ans2")%>" required>
        </div>
        <div class="form-field">
            <input type="text"  name="ans3" value="<%=request.getAttribute("ans3")%>" required>
        </div>
        <div class="form-field">
            <input type="text"  name="ans4" value="<%=request.getAttribute("ans4")%>" required>
        </div>
        <div class="form-field">
            <input type="text" name="correctAns" value="<%=request.getAttribute("correctAns")%>" required>
        </div>

        <button class="button">Submit</button>
    </form>
</div>

</body>
</html>
