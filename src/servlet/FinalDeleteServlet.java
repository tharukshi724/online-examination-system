package servlet;

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

@WebServlet("/FinalDeleteServlet")
public class FinalDeleteServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(FinalDeleteServlet.class.getName());
    private FinalExamService sv;
    public FinalDeleteServlet() {
        super();
        sv = new FinalExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fquestionId= Integer.parseInt(request.getParameter("fquestionId"));



        try {
            sv.deleteQuestion(fquestionId);
            response.sendRedirect("FinalPaper.jsp");
        } catch ( SQLException e) {

            e.printStackTrace();
        }
    }
}
