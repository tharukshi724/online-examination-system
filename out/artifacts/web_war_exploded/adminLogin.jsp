<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/12/2021
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        html {
            scroll-behavior: smooth;
        }


        body,
        html {
            margin: 0;
            padding: 0;
            font-family: 'Nunito', sans-serif;



        }

        * {
            box-sizing: border-box;

        }

        .d-grid {
            display: grid;
        }

        .d-flex {
            display: flex;
            display: -webkit-flex;
        }

        .text-center {
            text-align: center;
        }

        .text-left {
            text-align: left;
        }

        .text-right {
            text-align: right;
        }

        button,
        input,
        select {
            -webkit-appearance: none;
            outline: none;
            font-family: 'Nunito', sans-serif;
        }

        button,
        .btn,
        select {
            cursor: pointer;
        }

        a {
            text-decoration: none;
        }

        img {
            max-width: 100%;
        }

        ul {
            margin: 0;
            padding: 0
        }

        h1,
        h2,
        h3,
        h4,
        h5,
        h6,
        p {
            margin: 0;
            padding: 0
        }

        p {
            color: #666;
            font-size: 18px;
            line-height: 25px;
        }

        .p-relative {
            position: relative;
        }

        .p-absolute {
            position: absolute;
        }

        .p-fixed {
            position: fixed;
        }

        .p-sticky {
            position: sticky;
        }

        .btn,
        button,
        .actionbg,
        input {
            border-radius: 4px;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            -o-border-radius: 4px;
            -ms-border-radius: 4px;
        }

        .btn:hover,
        button:hover {
            transition: 0.5s ease;
            -webkit-transition: 0.5s ease;
            -o-transition: 0.5s ease;
            -ms-transition: 0.5s ease;
            -moz-transition: 0.5s ease;
        }

        /*-- wrapper start --*/
        .wrapper {
            width: 100%;
            padding-right: 15px;
            padding-left: 15px;
            margin-right: auto;
            margin-left: auto;
        }

        @media (min-width: 576px) {
            .wrapper {
                max-width: 540px;
            }
        }

        @media (min-width: 768px) {
            .wrapper {
                max-width: 720px;
            }
        }

        @media (min-width: 992px) {
            .wrapper {
                max-width: 960px;
            }
        }

        @media (min-width: 1200px) {
            .wrapper {
                max-width: 1140px;
            }
        }

        .wrapper-full {
            width: 100%;
            padding-right: 15px;
            padding-left: 15px;
            margin-right: auto;
            margin-left: auto;
        }

        /*-- //wrapper start --*/

        /*-- form styling --*/
        .w3l-workinghny-form .logo {
            text-align: center;
        }

        .w3l-workinghny-form .logo a.brand-logo {
            display: inline-block;
            text-align: center;
            font-size: 35px;
            line-height: 1.1em;
            font-weight: 700;
            color: #fff;
            text-transform: capitalize;
        }

        .w3l-workinghny-form h1 {
            font-size: 50px;
            line-height: 1.1em;
            font-weight: 700;
            color: #3f3a64;
        }

        .w3l-workinghny-form {
            position: relative;
            z-index: 0;
            padding: 3em 0px;
            display: grid;
            align-items: center;
            min-height: 100vh;
            background: url(../images/banner.jpg) no-repeat center;
            background-size: cover;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            -ms-background-size: cover;

        }

        .w3l-workinghny-form:before {
            content: "";
            background: rgba(0, 4, 4, 0.6);
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            z-index: -1;
        }

        .w3l-workinghny-form .pos-relative {
            position: relative;
        }

        .w3l-workinghny-form p.copy-footer-29 {
            color: #eee;
        }

        .w3l-workinghny-form p.copy-footer-29 a {
            color: #fff;
        }

        .w3l-workinghny-form p.copy-footer-29 a:hover {
            color: #fbbb92;
        }

        .w3l-workinghny-form h2 {
            font-size: 20px;
            text-align: center;
            margin-bottom: 15px;
        }

        .workinghny-block-grid {
            border-radius: 5px;
            box-shadow: 2px 9px 49px -17px rgba(0, 0, 0, 0.1);
            height: auto;
            max-width: 400px;
            padding: 40px;
            width: 100%;
            margin: 40px auto;
            background: #fff;
        }

        .w3l-workinghny-form .login-form-content {
            padding-top: 2em;
        }

        .w3l-workinghny-form input {
            border: 2px solid #e3e3e3;
            color: #777;
            background: #fff;
            font-size: 17px;
            line-height: 28px;
            padding: 12px 26px;
            width: 100%;
            margin-bottom: 20px;
            border-radius: 35px;
            outline: none;
        }

        .w3l-workinghny-form input:focus {
            border: 2px solid #f1c6aa;
            box-shadow: none;
        }

        .w3l-workinghny-form .btn-style {
            font-size: 18px;
            color: #fff;
            width: 100%;
            background: #fbbb92;
            border: none;
            padding: 15px 20px;
            font-weight: 700;
            border-radius: 35px;
            transition: .3s ease;
            -webkit-transition: .3s ease;
            -moz-transition: .3s ease;
            -ms-transition: .3s ease;
            -o-transition: .3s ease;
        }

        .w3l-workinghny-form .btn-style:hover {
            background: #fdb485;
            transform: translateY(-3px);
        }

        .w3l-workinghny-form p.already,
        .w3l-workinghny-form p.already a {
            font-size: 17px;
            line-height: 25px;
            color: #495057;
            margin: 25px 0 0;
            text-align: center;
        }

        .w3l-workinghny-form p.remember {
            color: #495057;
            font-size: 15px;
            font-weight: 600;
            line-height: 20px;
        }

        .w3l-workinghny-form p.already a {
            color: #495057;
            font-weight: 700;
        }

        .w3l-workinghny-form p.already a:hover {
            color: #fbbb92;
        }

        .w3l-workinghny-form .check-remaind input {
            position: absolute;
            opacity: 0;
            cursor: pointer;
            height: 0;
            width: 0;
        }

        .w3l-workinghny-form .check-remaind {
            display: block;
            position: relative;
            padding-left: 35px;
            cursor: pointer;
            margin-bottom: 20px;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        .w3l-workinghny-form .check-remaind input {
            position: absolute;
            opacity: 0;
            cursor: pointer;
            height: 0;
            width: 0;
            padding: 0;
            margin: 0;
        }

        .w3l-workinghny-form .checkmark {
            position: absolute;
            top: 0px;
            left: 0;
            height: 21px;
            width: 21px;
            background-color: #F5F4F2;
            border-radius: 4px;
        }

        .w3l-workinghny-form .check-remaind:hover input~.checkmark {
            background-color: #fbbb92;
        }

        .w3l-workinghny-form .check-remaind input:checked~.checkmark {
            background-color: #fbbb92;
        }

        .w3l-workinghny-form .checkmark:after {
            content: "";
            position: absolute;
            display: none;
        }

        .w3l-workinghny-form .check-remaind input:checked~.checkmark:after {
            display: block;
        }

        .w3l-workinghny-form .check-remaind .checkmark:after {
            left: 7px;
            top: 3px;
            width: 5px;
            height: 10px;
            border: solid #fff;
            border-width: 0 2px 2px 0;
            transform: rotate(45deg);
        }

        .social-media a {
            display: block;
            text-align: center;
            padding: 14px 20px;
            font-size: 16px;
            font-weight: 600;
            margin-bottom: 10px;
            background: #eee;
            border-radius: 35px;
        }
        .social-media a span {
            margin-right: 8px;
        }

        .social-media a.fb {
            background: #3b5998;
            color: #fff;
        }
        .social-media a.fb:hover {
            background: #314e8a;
        }
        .social-media a.tw {
            background: #1da1f2;
            color: #fff;
        }
        .social-media a.tw:hover {
            background: #1091e1;
        }

        /* -- placeholder --*/
        ::-webkit-input-placeholder {
            /* Chrome/Opera/Safari */
            color: #777;
        }

        ::-moz-placeholder {
            /* Firefox 19+ */
            color: #777;
        }

        :-ms-input-placeholder {
            /* IE 10+ */
            color: #777;
        }

        :-moz-placeholder {
            /* Firefox 18- */
            color: #777;
        }

        /* -- placeholder --*/


        /*-- responsive design --*/
        @media (max-width: 992px) {
            .w3l-workinghny-form .workinghny-block-grid {
                grid-template-columns: 1fr;
                grid-gap: 10px;
                width: 100%;
            }

            .w3l-workinghny-form .login-form-content {
                padding: 0em 0em 2em 0;
            }

            .workinghny-left-img {
                order: 2;
            }

            .w3l-workinghny-form .logo a.brand-logo {
                font-size: 40px;
                margin-bottom: 10px;
            }

            .w3l-workinghny-form {
                height: auto;
            }
        }

        @media (max-width: 667px) {
            .w3l-workinghny-form .align-end {
                padding: 0em;
            }
        }

        @media (max-width: 480px) {
            .w3l-workinghny-form .logo a.brand-logo {
                font-size: 35px;
            }

            .w3l-workinghny-form h2 {
                font-size: 22px;
            }
        }

        @media (max-width: 415px) {
            .w3l-workinghny-form .copyright {
                margin-top: 30px;
            }
        }

    </style>
</head>
<body>
<!-- form section start -->
<section class="w3l-workinghny-form">
    <!-- /form -->
    <div class="workinghny-form-grid">
        <div class="wrapper">

            <div class="workinghny-block-grid">
                <div class="form-right-inf">
                    <h2>Admin Login </h2>
                    <div class="social-media">
                        <a class="fb">Hey</a>
                        <a  class="tw">Welcome</a>
                    </div>
                    <div class="login-form-content">
                        <h2>Login with username</h2>
                        <form action="<%=request.getContextPath()%>/adminLoginServlet" class="signin-form" method="post">
                            <div class="one-frm">
                                <input type="text" name="username" placeholder="username" required="" autofocus>
                            </div>
                            <div class="one-frm">
                                <input type="password" name="password" placeholder="password" required="">
                            </div>

                            <button class="btn btn-style mt-3">Login </button>


                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
