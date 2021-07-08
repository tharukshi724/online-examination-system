
<%@ page import="java.util.List" %>
<%@ page import="service.FinalExamService" %>

<%@ page import="model.Final" %><%--
  Created by IntelliJ IDEA.
  User: Tharukshi
  Date: 11/05/2021
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<html>

<head>
    <title>PaymentManagement</title>

    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"
    >
    <link rel="stylesheet" href="FinalPaper.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.4/semantic.min.js"></script>




</head>
<body >



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
                    <a href="Final.jsp" class="side-nav__link">
                        <i class="search icon side-nav__icon"></i>
                        <div class="side-nav__text">Create Final</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="#" class="side-nav__link">
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



            <section class="ui container">










                    <% FinalExamService fin= new FinalExamService();

                    List<Final> finalList= fin.selectAllFinalQuestions(); %>
                <section class="details">
                    <div class="card">
                        <table class="ui selectable compact blue table">
                            <thead>
                            <tr>


                                <th>Question</th>
                                <th>Correct answer</th>
                                <th>Actions</th>
                            </tr>
                            </thead>
                            <tbody>
                            <!-- table data -->
                            <%for(Final i:finalList){ %>
                            <tr>


                                <td>
                                    <%=i.getFquestion() %>
                                </td>

                                <td>
                                    <%=i.getFcorrectAns()%>
                                </td>

                                <td><a href="FinalRetriveToEditServlet?fquestionId=<%=i.getFquestionId()%>" > <i class="yellow pen square icon"></i></a> &nbsp;&nbsp;&nbsp;&nbsp; <a  href="FinalDeleteServlet?fquestionId=<%=i.getFquestionId()%>" > <i class="red trash icon"></i></a></td>
                            </tr>
                            <%} %>




                            </tbody>

                        </table>

                    </div>
                </section>



        </div>
    </div>
</div>
</div>


</body>

</html>
