package servlet;

import service.examDetailsService;
import service.midExamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/MidDeleteServlet")
public class MidDeleteServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(MidDeleteServlet.class.getName());
    private midExamService sv;

    public MidDeleteServlet() {
        super();
        sv = new  midExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int questionId= Integer.parseInt(request.getParameter("questionId"));



        try {
            sv.deleteQuestion(questionId);
            response.sendRedirect("MidPaper.jsp");
        } catch ( SQLException e) {

            e.printStackTrace();
        }
    }
}
