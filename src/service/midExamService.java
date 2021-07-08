package service;

import model.Mid;
import model.examDetails;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class midExamService {

    public static final Logger logger = Logger.getLogger(midExamService.class.getName());
    static Connection connection;
    // method for insert payments
    public static void addMidQ(Mid mid) throws SQLException {



        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Mid"+" (examId,subject,question,ans1,ans2,ans3,ans4,correctAns)VALUES "+" (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,mid.getExamId());
            preparedStatement.setString(2,mid.getSubject());
            preparedStatement.setString(3,mid.getQuestion());


            preparedStatement.setString(4,mid.getAns1());
            preparedStatement.setString(5, mid.getAns2());
            preparedStatement.setString(6, mid.getAns3());
            preparedStatement.setString(7, mid.getAns4());
            preparedStatement.setString(8, mid.getCorrectAns());

            System.out.println(preparedStatement);
            preparedStatement.executeLargeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());

        }


    }

    public static Mid selectMid(int questionId){
       Mid mid=null;

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT questionId,examId,subject,question,ans1,ans2,ans3,ans4,correctAns FROM Mid WHERE questionId= ?");
            preparedStatement.setInt(1,questionId);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
               int examId = rs.getInt("examId");

                String subject = rs.getString("subject");
                String question = rs.getString("question");

                String  ans1= rs.getString("ans1");
                String  ans2= rs.getString("ans2");
                String  ans3= rs.getString("ans3");
                String  ans4= rs.getString("ans4");
                String  correctAns= rs.getString("correctAns");

                mid = new   Mid(questionId,examId,subject,question,ans1,ans2,ans3,ans4,correctAns);
            }
            System.out.println(preparedStatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mid;

    }

    public static List<Mid> selectAllMidQuestions(){

        List<Mid> mid = new ArrayList<>();

        try{
            connection = DBConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Mid");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int questionId = rs.getInt("questionId");
                int examId = rs.getInt("examId");
                String subject = rs.getString("subject");
                String question = rs.getString("question");


                String  ans1= rs.getString("ans1");
                String  ans2= rs.getString("ans2");
                String  ans3= rs.getString("ans3");
                String  ans4= rs.getString("ans4");
                String  correctAns= rs.getString("correctAns");

               mid.add(new Mid(questionId,examId,subject,question,ans1, ans2 ,ans3, ans4,correctAns));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mid;
    }



    public  boolean deleteQuestion(int questionId)throws SQLException{
       Mid mid=null;
        boolean rowDeleted = false;
        try {

            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Mid WHERE questionId = ?");
            System.out.println(statement);

            statement.setInt(1,questionId);
            //use to update the query
            rowDeleted = statement.executeUpdate() > 0;//return number of rows deleted
        }catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowDeleted;


    }



    public static boolean updateQuestions(Mid mid) throws SQLException {
        boolean rowUpdated = false;
        try {


            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE Mid set examId = ?,subject=?,question= ?,ans1 = ? ,ans2= ?,ans3=?,ans4=?,correctAns=? where questionId = ?");

            statement.setInt(1, mid.getExamId());


            statement.setString(2,  mid.getSubject());
            statement.setString(3,  mid.getQuestion());

            statement.setString(4, mid.getAns1());
            statement.setString(5, mid.getAns2());
            statement.setString(6, mid.getAns3());
            statement.setString(7, mid.getAns4());
            statement.setString(8, mid.getCorrectAns());

            statement.setInt(9, mid.getQuestionId());
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
