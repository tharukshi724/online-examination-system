package servlet;

import model.Lecturer;
import service.LecturerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/LecturerInsertServlet")
public class LecturerInsertServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(LecturerInsertServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String staffId = request.getParameter("staffId");
        String NIC = request.getParameter("NIC");
        String name = request.getParameter("name");
        String section = request.getParameter("section");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Lecturer lec = new Lecturer(staffId,NIC,name,section,email,username,password);

        try{

            LecturerService.LecturerRecordsInsert(lec);
            RequestDispatcher dis = request.getRequestDispatcher("viewLecturer.jsp");
            dis.forward(request,response);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
