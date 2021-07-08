package service;

import model.Lecturer;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturerService {
    public static final Logger logger = Logger.getLogger(LecturerService.class.getName());
    private static Connection conn;
    private static PreparedStatement preparedStatement;

    public static List<Lecturer> LecturerRecordsRetrieve() {
        ArrayList<Lecturer> LR = new ArrayList<>();

        try {

            conn = DBConnection.getConnection();
            String sql = "select * from lecturer";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt("userId");
                String staffId = rs.getString("staffId");
                String NIC = rs.getString("NIC");
                String name = rs.getString("name");
                String section = rs.getString("section");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");


                Lecturer LecRec = new Lecturer(userId,staffId,NIC,name,section,email,username,password);

                LR.add(LecRec);

            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());

        }

        return LR;
    }

    //lecture Records insert

    public static void  LecturerRecordsInsert(Lecturer lec) {
        try {

            conn = DBConnection.getConnection();
            String sql = " INSERT INTO lecturer (staffId,NIC,name,section,email,username,password) VALUES (?,?,?,?,?,?,?)";

            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,lec.getStaffId());
            preparedStatement.setString(2, lec.getNIC());
            preparedStatement.setString(3,lec.getName());
            preparedStatement.setString(4, lec.getSection());
            preparedStatement.setString(5,lec.getEmail());
            preparedStatement.setString(6, lec.getUsername());
            preparedStatement.setString(7,lec.getPassword());


            preparedStatement.executeLargeUpdate();
            System.out.println(preparedStatement);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //lecture Records delete

    public  boolean LecturerRecordDelete(int userId)throws SQLException {
        Lecturer lec=null;
        boolean rowDeleted = false;
        try {

            conn = DBConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM lecturer WHERE userId = ?");
            System.out.println(statement);

            statement.setInt(1,userId);

            // update query

            rowDeleted = statement.executeUpdate() > 0;//return number of rows deleted
        }catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowDeleted;

    }


    //update lecturer Records

    public static boolean UpdateLectureRecords(Lecturer lec) throws SQLException {
        boolean rowUpdated = false;
        try {

            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE lecturer set staffId=?, NIC = ?,name = ?,section= ?,email = ?,username = ?,password = ? where userId=?");

            statement.setString(1,lec.getStaffId());
            statement.setString(2, lec.getNIC());
            statement.setString(3, lec.getName());
            statement.setString(4,lec.getSection());
            statement.setString(5,lec.getEmail());
            statement.setString(6,lec.getUsername());
            statement.setString(7,lec.getPassword());

            statement.setInt(8,lec.getUserId());

            System.out.println(statement);


            rowUpdated = statement.executeUpdate() > 0;//return number of rows updated
        } catch (SQLException | ClassNotFoundException e) {
            printSQLException((SQLException) e);
        }
        return rowUpdated;
    }


    //Retrieve to update lecturer Details

    public Lecturer selectRecord(int userId){
        Lecturer lec = null;

        try{
            conn = DBConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT userId,staffId,NIC,name,section,email,username,password FROM lecturer WHERE userId = ?");
            preparedStatement.setInt(1,userId);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {

                String staffId = rs.getString("staffId");
                String NIC = rs.getString("NIC");
                String name = rs.getString("name");
                String section = rs.getString("section");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");

                lec = new Lecturer(userId,staffId,NIC,name,section,email,username,password);

            }
            System.out.println(preparedStatement);

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return lec;

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
