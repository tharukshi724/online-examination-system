package servlet;

import model.Final;
import model.Mid;
import service.FinalExamService;
import service.midExamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/FinalAddServlet")
public class FinalAddServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(FinalAddServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fexamId = Integer.parseInt(request.getParameter("fexamId"));
        String subject = request.getParameter("subject");
        String fquestion = request.getParameter("fquestion");
        String fcorrectAns = request.getParameter("fcorrectAns");




        Final newFinal = new Final(fexamId,subject,fquestion,fcorrectAns);
        try {
            FinalExamService.addFinalQ(newFinal);
            response.sendRedirect("FinalPaper.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
