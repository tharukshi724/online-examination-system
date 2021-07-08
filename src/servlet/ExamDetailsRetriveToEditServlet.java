package servlet;

import model.examDetails;
import service.examDetailsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/ExamDetailsRetriveToEditServlet")
public class ExamDetailsRetriveToEditServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(ExamDetailsRetriveToEditServlet.class.getName());
    private examDetailsService exService;

    public void init() {
        this.exService = new examDetailsService ();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int examId = Integer.parseInt(request.getParameter("examId"));
        examDetails ex =  examDetailsService.selectExam(examId);

        request.setAttribute("examId",ex.getExamId());
        request.setAttribute("examName",ex.getExamName());

        request.setAttribute("subject",ex.getSubject());
        request.setAttribute("date",ex.getDate());
        request.setAttribute("lecturer",ex.getLecturer());

        request.getRequestDispatcher("editExamDetails.jsp").forward(request,response);

    }
}
