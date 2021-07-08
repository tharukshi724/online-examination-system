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
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/LecturerRetriveServlet")
public class LecturerRetriveServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(LecturerRetriveServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Lecturer> LecDetails = LecturerService.LecturerRecordsRetrieve();
            request.setAttribute("LecDetails", LecDetails);

        }catch(Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dis = request.getRequestDispatcher("viewLecturer.jsp");
        dis.forward(request, response);
    }
}
