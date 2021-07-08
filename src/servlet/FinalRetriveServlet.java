package servlet;

import model.Final;
import model.Mid;
import service.FinalExamService;
import service.midExamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(name = "FinalRetriveServlet")
public class FinalRetriveServlet extends HttpServlet {
    public static final Logger logger = Logger.getLogger(FinalRetriveServlet.class.getName());
    private static final long serialVersionUID = 1L;


    private FinalExamService fins;

    public void init() {
        this.fins = new  FinalExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Final> finQList = fins.selectAllFinalQuestions();






        request.setAttribute("finQList", finQList);

        RequestDispatcher dis = request.getRequestDispatcher("FinalPaper.jsp");
        dis.forward(request, response);
    }
}
