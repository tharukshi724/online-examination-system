<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 5/12/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="//fonts.googleapis.com/css2?family=Nunito:wght@300;400;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="studentLogin.css">


    <script src="https://kit.fontawesome.com/af562a2a63.js" crossorigin="anonymous"></script>
</head>
<body>

<!-- form section start -->
<section class="w3l-workinghny-form">
    <!-- /form -->
    <div class="workinghny-form-grid">
        <div class="wrapper">

            <div class="workinghny-block-grid">
                <div class="form-right-inf">
                    <h2>Student Login </h2>
                    <div class="social-media">
                        <a class="fb">Hey</a>
                        <a  class="tw">Welcome</a>
                    </div>
                    <div class="login-form-content">
                        <h2>Login with username</h2>
                        <form action="<%=request.getContextPath()%>/studentLoginServlet" class="signin-form" method="post">
                            <div class="one-frm">
                                <input type="text" name="username" placeholder="username" required="" autofocus>
                            </div>
                            <div class="one-frm">
                                <input type="password" name="password" placeholder="password" required="">
                            </div>

                            <button class="btn btn-style mt-3">Login </button>

                            <p class="already">Still not register  ?<a href="studentRegister.jsp">Sign up</a></p>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


</section>
</body>
</html>
