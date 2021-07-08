package service;

import model.Mid;
import model.examDetails;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RetriveMidPaper {
    public static final Logger logger = Logger.getLogger(RetriveMidPaper.class.getName());
    static Connection connection;
    public static List<Mid> getPaper(String subject) throws SQLException, ClassNotFoundException {

        List<Mid> list1 = new ArrayList<>();
        System.out.println("service"+subject);
        connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select question,ans1,ans2,ans3,ans4 from mid where subject= ? ");
        System.out.println(preparedStatement);

        preparedStatement.setString(1,subject);


        //  Execute the query or update query
        ResultSet rs = preparedStatement.executeQuery();

        //  Process the ResultSet object.
        while (rs.next()) {

            String question= rs.getString("question");
            String ans1 = rs.getString("ans1");
            String ans2 = rs.getString("ans2");
            String ans3 = rs.getString("ans3");
            String ans4 = rs.getString("ans4");


            list1.add(new Mid(question, ans1, ans2, ans3, ans4));
        }
        System.out.println(preparedStatement);

		return  list1;

    }
}
