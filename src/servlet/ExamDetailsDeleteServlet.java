package servlet;

import service.examDetailsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/ExamDetailsDeleteServlet")
public class ExamDetailsDeleteServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(ExamDetailsDeleteServlet.class.getName());
    private examDetailsService sv;

    public ExamDetailsDeleteServlet() {
        super();
        sv = new  examDetailsService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int examId= Integer.parseInt(request.getParameter("examId"));



        try {
            sv.deleteExams(examId);
            response.sendRedirect("ExamList.jsp");
        } catch ( SQLException e) {

            e.printStackTrace();
        }
    }
}
