package cn.gcu.exp.util;

import java.sql.*;

public class DBOperator {
    Connection conn = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/gitProject?useSSL=false";
            String user = "root";
            String pwd = "123456";
            conn = DriverManager.getConnection(url, user, pwd);
            //System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public ResultSet executeQuery(String sql) {
        Connection conn = getConnection();
        //Statement:执行SQL
        Statement stmt;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public int executeUpdate(String sql) {
        Connection conn = getConnection();
        int num = 0;
        try {
            Statement stmt = conn.createStatement();
            num = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
