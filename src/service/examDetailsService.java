package service;

import model.examDetails;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class examDetailsService {
    public static final Logger logger = Logger.getLogger(examDetailsService.class.getName());
    static Connection connection;
    // method for insert payments
    public static void addExamDetails(examDetails exdetails) throws SQLException {

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO examDetails"+" (examName,subject,date,type,lecturer)VALUES "+" (?,?,?,?,?)");
            preparedStatement.setString(1,exdetails.getExamName());

            preparedStatement.setString(2,exdetails.getSubject());

            preparedStatement.setDate(3,exdetails.getDate());
            preparedStatement.setString(4,exdetails.getType());
            preparedStatement.setString(5, exdetails.getLecturer());

            System.out.println(preparedStatement);
            preparedStatement.executeLargeUpdate();

        }catch(SQLException | ClassNotFoundException e){

            printSQLException((SQLException) e);
            logger.log(Level.SEVERE, e.getMessage());

        }


    }

    public static examDetails selectExam(int examId){
     examDetails exdetails=null;

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT examId,examName,subject,date,type,lecturer FROM examDetails WHERE examId = ?");
            preparedStatement.setInt(1,examId);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                String examName = rs.getString("examName");
                String subject = rs.getString("subject");
                Date date  = rs.getDate("date");
                String type = rs.getString("type");
                String  lecturer= rs.getString("lecturer");

                exdetails = new  examDetails(examId, examName,subject,date ,type,lecturer);
            }
            System.out.println(preparedStatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return exdetails;

    }

    public static List<examDetails> selectAllExamDetails(){

        List<examDetails> pays = new ArrayList<>();

        try{
            connection = DBConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM examDetails");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int examId = rs.getInt("examId");
                String examName = rs.getString("examName");
                String subject = rs.getString("subject");
                Date date  = rs.getDate("date");
                String type = rs.getString("type");
                String  lecturer= rs.getString("lecturer");

                pays.add(new examDetails(examId, examName,subject,date ,type,lecturer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return pays;
    }



    public  boolean deleteExams(int examId)throws SQLException{
        examDetails exdetails=null;
        boolean rowDeleted = false;
        try {

            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM examDetails WHERE examId = ?");
            System.out.println(statement);

            statement.setInt(1,examId);
            //use to update the query
            rowDeleted = statement.executeUpdate() > 0;//return number of rows deleted
        }catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowDeleted;


    }



    public static boolean updateExamDetails(examDetails exdetails) throws SQLException {
        boolean rowUpdated = false;
        try {


            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE examDetails set examName = ?,subject= ?,date = ? ,type=? ,lecturer= ? where examId = ?");

            statement.setString(1, exdetails.getExamName());

            statement.setString(2, exdetails.getSubject());

            statement.setDate(3,exdetails.getDate());
            statement.setString(4,exdetails.getType());

            statement.setString(5,exdetails.getLecturer());

            statement.setInt(6,exdetails.getExamId());
            System.out.println(statement);

            rowUpdated = statement.executeUpdate() > 0;//return number of rows updated
        }catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowUpdated;
    }



    private static void printSQLException(SQLException ex) {
        for(Throwable e:ex)
            if (e instanceof SQLException) {

                e.printStackTrace(System.err);
                System.err.println("SQLState:" + ((SQLException) e).getSQLState());
                System.err.println("Error Code:" + ((SQLException) e).getErrorCode());
                System.err.println("Message:" + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }

            }
    }



}
