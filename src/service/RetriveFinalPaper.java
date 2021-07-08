package service;

import model.Final;
import model.Mid;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RetriveFinalPaper {

    static Connection connection;
    public static List<Final> getPaper(String subject) throws SQLException, ClassNotFoundException {

        List<Final> list2 = new ArrayList<>();
        connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT  * from Final where subject=? ");

        preparedStatement.setString(1, subject);

        //System.out.println("service"+date);
        //  Execute the query or update query
        ResultSet rs = preparedStatement.executeQuery();

        //  Process the ResultSet object.
        while (rs.next()) {

            String fquestion = rs.getString("fquestion");



            list2.add(new Final(fquestion));
        }
        System.out.println(preparedStatement);

        return  list2;

    }
}
