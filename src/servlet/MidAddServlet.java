package servlet;

import model.Mid;
import model.examDetails;
import service.examDetailsService;
import service.midExamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/MidAddServlet")
public class MidAddServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(MidAddServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int examId = Integer.parseInt(request.getParameter("examId"));
         String subject = request.getParameter("subject");
        String question = request.getParameter("question");

        String ans1 = request.getParameter("ans1");
        String ans2 = request.getParameter("ans2");
        String ans3 = request.getParameter("ans3");
        String ans4 = request.getParameter("ans4");
        String correctAns = request.getParameter("correctAns");




        Mid newMid = new Mid(examId,subject,question, ans1,ans2,ans3,ans4,correctAns);
        try {
            midExamService.addMidQ(newMid);
            response.sendRedirect("MidPaper.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
