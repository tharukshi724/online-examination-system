package servlet;

import model.examDetails;
import model.student;
import service.examDetailsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Logger;

import service.studentRegisterService;

@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(StudentRegistrationServlet.class.getName());
    studentRegisterService st = new studentRegisterService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");

        String lastname = request.getParameter("lastname");

        String studentId= request.getParameter("studentId");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        student newStudent = new   student(firstname,lastname, studentId,username, password);
        st.registerUser(newStudent);
        response.sendRedirect("studentLogin.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
