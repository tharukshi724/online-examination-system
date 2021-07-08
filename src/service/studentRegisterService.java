package service;

import model.student;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class studentRegisterService {
    public static final Logger logger = Logger.getLogger(studentRegisterService.class.getName());
    public static Connection connection;

    public void registerUser(student st){

         try{
             connection  = DBConnection.getConnection();

             try{
                 connection = DBConnection.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student"+" (firstname,lastname,studentId,username,password)VALUES "+" (?,?,?,?,?)");
                 preparedStatement.setString(1,st.getFirstname());

                 preparedStatement.setString(2,st.getLastname());
                 preparedStatement.setString(3,st.getStudentId());

                 preparedStatement.setString(4,st.getUsername());
                 preparedStatement.setString(5,st.getPassword());


                 System.out.println(preparedStatement);
                 preparedStatement.executeLargeUpdate();

             }catch(SQLException | ClassNotFoundException e){

                 printSQLException((SQLException) e);

                 logger.log(Level.SEVERE, e.getMessage());



             }

         } catch (SQLException throwables) {
             throwables.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }

    }

    private void printSQLException(SQLException e) {
    }
}
