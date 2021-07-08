package service;

import model.Final;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalExamService {
    public static final Logger logger = Logger.getLogger(FinalExamService.class.getName());
    static Connection connection;
    // method for insert payments
    public static void addFinalQ(Final fina)throws SQLException {

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Final"+" (fexamId,subject,fquestion,fcorrectAns)VALUES "+" (?,?,?,?)");
            preparedStatement.setInt(1,fina.getFexamId());

            preparedStatement.setString(2,fina.getSubject());
            preparedStatement.setString(3,fina.getFquestion());

            preparedStatement.setString(4,fina.getFcorrectAns());


            System.out.println(preparedStatement);
            preparedStatement.executeLargeUpdate();

        }catch(SQLException | ClassNotFoundException e){

            printSQLException((SQLException) e);
            logger.log(Level.SEVERE, e.getMessage());

        }


    }

    public static Final selectFinal(int fquestionId){
        Final fina = null;

        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT fquestionId,fexamId,subject,fquestion,fcorrectAns FROM Final WHERE fquestionId= ?");
            preparedStatement.setInt(1,fquestionId);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int fexamId = rs.getInt("fexamId");

                String subject = rs.getString("subject");
                String fquestion = rs.getString("fquestion");


                String fcorrectAns= rs.getString("fcorrectAns");

                fina = new Final(fquestionId,fexamId,subject,fquestion,fcorrectAns);
            }
            System.out.println(preparedStatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return fina;

    }

    public static List<Final> selectAllFinalQuestions(){

        List<Final> fin = new ArrayList<>();

        try{
            connection = DBConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Final");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int fquestionId = rs.getInt("fquestionId");
                int fexamId = rs.getInt("fexamId");

                String subject = rs.getString("subject");
                String fquestion = rs.getString("fquestion");

                String  fcorrectAns= rs.getString("fcorrectAns");

                fin.add(new Final(fquestionId,fexamId,subject, fquestion,fcorrectAns));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return fin;
    }



    public  boolean deleteQuestion(int fquestionId)throws SQLException{
        Final fin=null;
        boolean rowDeleted = false;
        try {

            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Final WHERE fquestionId = ?");
            System.out.println(statement);

            statement.setInt(1,fquestionId);
            //use to update the query
            rowDeleted = statement.executeUpdate() > 0;//return number of rows deleted
        }catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowDeleted;


    }



    public static boolean updateQuestions(Final fin) throws SQLException {
        boolean rowUpdated = false;
        try {


            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE Final set fexamId = ?,subject=?,fquestion =?,fcorrectAns=? where fquestionId = ?");

            statement.setInt(1, fin.getFexamId());
            statement.setString(2, fin.getSubject());
            statement.setString(3,fin.getFquestion());

            statement.setString(4, fin.getFcorrectAns());




            statement.setInt(5, fin.getFquestionId());
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
