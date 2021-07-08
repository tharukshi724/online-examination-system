package servlet;

import service.RetriveFinalPaper;
import service.RetriveMidPaper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/GetPaperServlet")
public class GetPaperServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(GetPaperServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                  String subject = request.getParameter("subject");
        System.out.println("servlet"+subject);
                  String type =  request.getParameter("type");
        System.out.println("servlet"+type);

                  if(type.equals("Mid")){
                      try {
                          System.out.println("Inservlet"+subject);
                          RetriveMidPaper.getPaper(subject);
                          response.sendRedirect("MidQuiz.jsp");
                      } catch (SQLException | ClassNotFoundException throwables) {
                          throwables.printStackTrace();
                      }
                  }
                  else if(type.equals("Final")){
                      try {
                          RetriveFinalPaper.getPaper(subject);
                          response.sendRedirect("FinalWritten.jsp");
                      } catch (SQLException | ClassNotFoundException throwables) {
                          throwables.printStackTrace();
                      }
                  }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
