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
import java.util.logging.Logger;

@WebServlet("/FinalRetriveToEditServlet")
public class FinalRetriveToEditServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(FinalRetriveToEditServlet.class.getName());

    private FinalExamService fins;

    public void init() {
        this.fins = new FinalExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fquestionId = Integer.parseInt(request.getParameter("fquestionId"));

        Final fin =  FinalExamService.selectFinal(fquestionId);

        request.setAttribute("fquestionId",fin.getFquestionId());
        System.out.println("servlet"+fquestionId);
        request.setAttribute("fexamId",fin.getFexamId());

        request.setAttribute("subject",fin.getSubject());
        request.setAttribute("fquestion",fin.getFquestion());


        request.setAttribute("fcorrectAns",fin.getFcorrectAns());

        request.getRequestDispatcher("Finaledit.jsp").forward(request,response);

    }
}
