<%@ page import="service.LecturerService" %>
<%@ page import="model.Lecturer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 5/11/2021
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>view lecturers</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="styles/viewLecturer.css">

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
                    <a href="registerLecturer.jsp" class="side-nav__link">
                        <i class="search icon side-nav__icon"></i>
                        <div class="side-nav__text">Register Lecturer</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="#" class="side-nav__link">
                        <i class="tasks icon side-nav__icon"></i>
                        <div class="side-nav__text">Manage Lecturers</div>
                    </a>
                </li>

            </ul>

            <div class="legal">
                &copy; 2021 by ExamFever. All rights reserved.
            </div>
        </div>

        <div class="main-content">

    <div id="clr_div">
        <div id="att_div" class="div">

            <div class ="Records"><h1>Lecturer Details</h1></div>

            <center>

                <%LecturerService Lect = new LecturerService();
                    List<Lecturer> Leclist = Lect.LecturerRecordsRetrieve(); %>

                <table>
                    <thead>
                    <tr>
                        <th> userId </th>
                        <th> staffid </th>
                        <th> NIC</th>
                        <th> name</th>

                        <th> section</th>
                        <th>email</th>
                        <th> username</th>
                        <th>password</th>

                        <th class="save_clm">Action</th>
                    </tr>
                    </thead>

                    <tbody>
                    <%for(Lecturer i:Leclist){ %>

                    <tr>

                        <td>
                            <%=i. getUserId() %>
                        </td>
                        <td>
                            <%=i. getStaffId() %>
                        </td>
                        <td>
                            <%=i. getNIC() %>
                        </td>

                        <td>
                            <%=i.getName() %>
                        </td>
                        <td>
                            <%=i.getSection() %>
                        </td>
                        <td>
                            <%=i.getEmail() %>
                        </td>

                        <td>
                            <%=i.getUsername()  %>
                        </td>
                        <td>
                            <%=i.getPassword() %>
                        </td>


                        <td><a href="LectureRetriveToEditServlet?userId=<%=i.getUserId()%>" > <i class= "fa fa-pencil" aria-hidden ="true" style="color:darkblue;width:20px"></i></a> <a href ="LecturerDeleteServlet?userId=<%=i.getUserId()%>" ><i class="fa fa-trash-o" aria-hidden="true" style="color:#ff0000"></i></a></td>

                    </tr>
                    <%} %>


                    </tbody>
                </table>



            </center>
        </div>
        <div class="div" id="btn_div" >

        </div>
    </div>

</div>
</div>
</div>

</body>
</html>




