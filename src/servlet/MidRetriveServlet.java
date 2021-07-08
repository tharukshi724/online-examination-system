package servlet;

import model.Mid;
import model.examDetails;
import service.examDetailsService;
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

@WebServlet("/MidRetriveServlet")
public class MidRetriveServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(MidRetriveServlet.class.getName());
    private static final long serialVersionUID = 1L;


    private midExamService mids;

    public void init() {
        this.mids = new midExamService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Mid> midQList = mids.selectAllMidQuestions();






        request.setAttribute("midQList", midQList);

        RequestDispatcher dis = request.getRequestDispatcher("MidPaper.jsp");
        dis.forward(request, response);
    }
}
