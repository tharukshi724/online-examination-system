package servlet;

import model.Marks;
import service.StoreMarks;
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

@WebServlet("/retriveMarksServlet")
public class retriveMarksServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(retriveMarksServlet.class.getName());

    private static final long serialVersionUID = 1L;


    private StoreMarks sm;

    public void init() {
        this.sm = new StoreMarks();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Marks>mList = StoreMarks.selectAllMarks();

        request.setAttribute("mList",mList);

        RequestDispatcher dis = request.getRequestDispatcher("Allmarks.jsp");
        dis.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
