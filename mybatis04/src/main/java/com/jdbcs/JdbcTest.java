package com.jdbcs;

import java.lang.reflect.Type;
import java.sql.*;

public class JdbcTest {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root" ,"123456");
        String sql="call testadd(?,?,?)";
        CallableStatement callableStatement=conn.prepareCall(sql);
        callableStatement.setInt(1,5);
        callableStatement.setInt(2,4);
        callableStatement.registerOutParameter(3, Types.INTEGER);
        int i = callableStatement.executeUpdate();
        int n=callableStatement.getInt(3);
        System.out.println(n);
    }
}
