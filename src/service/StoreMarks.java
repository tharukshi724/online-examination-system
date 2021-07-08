package service;

import model.Marks;
import model.Mid;
import util.DBConnection;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreMarks {

    public static final Logger logger = Logger.getLogger(StoreMarks.class.getName());
    private static Connection connection;

    public static void insertMarks(Marks marks) throws SQLException {

        try {
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO marks" + " (studentId,grade)VALUES " + " (?,?)");
            preparedStatement.setString(1, marks.getStudentId());
            preparedStatement.setString(2, marks.getGrade());


            System.out.println(preparedStatement);
            preparedStatement.executeLargeUpdate();

        } catch (SQLException | ClassNotFoundException e) {

            printSQLException((SQLException) e);

            logger.log(Level.SEVERE, e.getMessage());



        }
    }

    public static List<Marks> selectAllMarks(){
          List<Marks> marksList = new ArrayList<>();

          try{
              connection = DBConnection.getConnection();
              PreparedStatement statement = connection.prepareStatement("SELECT * from marks");
              ResultSet rs = statement.executeQuery();

              while(rs.next()){
                  int markId = rs.getInt("markId");
                  String studentId = rs.getString("studentId");
                  String grade = rs.getString("grade");
                  marksList.add(new Marks(markId,studentId,grade));
              }
          } catch (SQLException throwables) {
              throwables.printStackTrace();
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }
          return marksList;
    }

    private static void printSQLException(SQLException e) {
    }

}