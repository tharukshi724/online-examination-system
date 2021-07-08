<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
      <link
              rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css"
      >
      <link rel="stylesheet" href="examDetails.css">

      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.4/semantic.min.js"></script>
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
                       <a href="ExamList.jsp" class="side-nav__link">
                           <i class="search icon side-nav__icon"></i>
                           <div class="side-nav__text">All Exam Details</div>
                       </a>
                   </li>

                   <li class="side-nav__item">
                       <a href="#" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Add Exam </div>
                       </a>
                   </li>
                   <li class="side-nav__item">
                       <a href="Mid.jsp" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Create Mid Exam</div>
                       </a>
                   </li>
                   <li class="side-nav__item">
                       <a href="MidPaper.jsp" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Mid Papers</div>
                       </a>
                   </li>
                   <li class="side-nav__item">
                       <a href="Final.jsp" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Create Final Exam</div>
                       </a>
                   </li>
                   <li class="side-nav__item">
                       <a href="FinalPaper.jsp" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Final Papers</div>
                       </a>
                   </li>
                   <li class="side-nav__item">
                       <a href="InsertMarks.jsp" class="side-nav__link">
                           <i class="tasks icon side-nav__icon"></i>
                           <div class="side-nav__text">Insert Marks</div>
                       </a>
                   </li>

               </ul>

               <div class="legal">
                   &copy; 2021 by ExamFever. All rights reserved.
               </div>
           </div>

           <div class="main-content">
               <h2>Enter Exam details to create Exam</h2>
   <div class="container1">

       <form method="post" class="form" action="<%=request.getContextPath()%>/ExamDetailsAddServlet">
           <div class="form-field">
               <input type="text" name="examName" placeholder="Enter exam name" required>
           </div>
           <div class="form-field">
               <input type="text" name="subject" placeholder="Enter subject" required>
           </div>
           <div class="form-field">
               <input type="date" name="date" placeholder="Enter date" required>
           </div>
           <div class="form-field">
               <select name="type">
                   <option value="Mid">Mid Exam</option>


                   <option value="Final">Final</option>


               </select>
           </div>
           <div class="form-field">
               <input type="text" name="lecturer" placeholder="Enter lecturername" required>
           </div>
           <button class="button">Submit</button>
       </form>
   </div>


</div>

  </body>
</html>