package servlet;

import service.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/lecturerLoginServlet")
public class lecturerLoginServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(lecturerLoginServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        login l = new login();

        //if login success redirect to adminDashboard ,if login unsuccess display same page
        if(l.lecturerLogin(username,password)) {
            RequestDispatcher dis = request.getRequestDispatcher("examDetails.jsp");
            dis.forward(request, response);
        }
        else{
            RequestDispatcher dis = request.getRequestDispatcher("lecturerLogin.jsp");
            dis.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
