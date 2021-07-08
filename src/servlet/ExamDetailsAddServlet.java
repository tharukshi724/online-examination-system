package servlet;

import model.examDetails;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Logger;

import service.examDetailsService;

@WebServlet("/ExamDetailsAddServlet")
public class ExamDetailsAddServlet extends HttpServlet {
    public static final Logger logger = Logger.getLogger(ExamDetailsAddServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String examName = request.getParameter("examName");

        String subject = request.getParameter("subject");

        Date date=  Date.valueOf(request.getParameter("date"));
        String type = request.getParameter("type");
        String lecturer = request.getParameter("lecturer");


       examDetails newExam = new  examDetails(examName,subject, date,type, lecturer);
        try {
            examDetailsService.addExamDetails(newExam);
            response.sendRedirect("ExamList.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
