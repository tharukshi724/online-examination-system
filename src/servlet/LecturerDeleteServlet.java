package servlet;

import service.LecturerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/LecturerDeleteServlet")
public class LecturerDeleteServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(LecturerDeleteServlet.class.getName());
    private LecturerService lecturerService;

    public LecturerDeleteServlet() {
        super();
        lecturerService = new LecturerService();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userId = Integer.parseInt(request.getParameter("userId"));
        try {
            lecturerService.LecturerRecordDelete(userId);
            response.sendRedirect("viewLecturer.jsp");
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
