package servlet;

import model.examDetails;
import service.examDetailsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/ExamDetailsRetriveServlet")
public class ExamDetailsRetriveServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(ExamDetailsRetriveServlet.class.getName());

    private static final long serialVersionUID = 1L;


    private examDetailsService exService;

    public void init() {
        this.exService = new examDetailsService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<examDetails>examlist = exService.selectAllExamDetails();






        request.setAttribute("examlist", examlist);

        RequestDispatcher dis = request.getRequestDispatcher("ExamList.jsp");
        dis.forward(request, response);
    }
}
