package servlet;

import model.Lecturer;
import service.LecturerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/LecturerEditServlet")
public class LecturerEditServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(LecturerEditServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int userId = Integer.parseInt(request.getParameter("userId"));
        String staffId = request.getParameter("staffId");
        String NIC = request.getParameter("NIC");
        String name = request.getParameter("name");
        String section = request.getParameter("section");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        Lecturer lec = new Lecturer(userId,staffId,NIC,name,section,email,username,password);
        try {
            LecturerService.UpdateLectureRecords(lec);
            response.sendRedirect("viewLecturer.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
