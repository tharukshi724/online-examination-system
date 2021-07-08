package servlet;

import model.Marks;
import service.StoreMarks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet("/AddMarksServlet")
public class AddMarksServlet extends HttpServlet {

    public static final Logger logger = Logger.getLogger(AddMarksServlet.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String studentId = request.getParameter("studentId");
            int marks = Integer.parseInt(request.getParameter("marks"));

            if(marks >= 75){
                String grade = "A";
                Marks newmark = new Marks(studentId,grade);

                try{
                    StoreMarks.insertMarks(newmark);
                    response.sendRedirect("InsertMarks.jsp");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            else if((marks< 75) && (marks >= 65) ){
                String grade = "B";
                Marks newmark = new Marks(studentId,grade);

                try{
                    StoreMarks.insertMarks(newmark);
                    response.sendRedirect("InsertMarks.jsp");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            else if((marks < 65) && (marks >= 45)){
                String grade = "C";
                Marks newmark = new Marks(studentId,grade);

                try{
                    StoreMarks.insertMarks(newmark);
                    response.sendRedirect("InsertMarks.jsp");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            else{
                String grade = "F";
                Marks newmark = new Marks(studentId,grade);

                try{
                    StoreMarks.insertMarks(newmark);
                    response.sendRedirect("InsertMarks.jsp");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
