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
import java.util.logging.Logger;


@WebServlet("/MidRetriveToEditServlet")
public class MidRetriveToEditServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(MidRetriveToEditServlet.class.getName());
    private midExamService mids;

    public void init() {
        this.mids = new midExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int questionId = Integer.parseInt(request.getParameter("questionId"));

      Mid mid =  midExamService.selectMid(questionId);

        request.setAttribute("questionId",mid.getQuestionId());

        request.setAttribute("examId",mid.getExamId());
        request.setAttribute("subject",mid.getSubject());
        request.setAttribute("question",mid.getQuestion());

        request.setAttribute("ans1",mid.getAns1());
        request.setAttribute("ans2",mid.getAns2());
        request.setAttribute("ans3",mid.getAns3());
        request.setAttribute("ans4",mid.getAns4());
        request.setAttribute("correctAns",mid.getCorrectAns());

        request.getRequestDispatcher("MidEdit.jsp").forward(request,response);

    }
}
