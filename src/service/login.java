package service;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login {

    public static final Logger logger = Logger.getLogger(login.class.getName());
private static Connection connection;
    public boolean adminlogin(String username,String password){

        boolean st = false;
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM admin WHERE username =? and password=?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);


            ResultSet rs = preparedStatement.executeQuery();
            st  = rs.next();

        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());

        }


        return st;
    }
    public boolean studentLogin(String username,String password){
        boolean st = false;
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE username =? and password=?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);


            ResultSet rs = preparedStatement.executeQuery();
            st  = rs.next();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();

        }


        return st;
    }

    public boolean lecturerLogin(String username,String password){
        boolean st = false;
        try{
            connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM lecturer WHERE username =? and password=?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);


            ResultSet rs = preparedStatement.executeQuery();
            st  = rs.next();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();

        }


        return st;
    }
}
