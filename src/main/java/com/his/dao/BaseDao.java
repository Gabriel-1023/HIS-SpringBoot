package com.his.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    private Connection conn;
    public Connection getConn() throws Exception
    {
        if(conn==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/his?characterEncoding=utf-8", "root", "1023464930");
        }
        return conn;
    }

    public void closeConn() throws SQLException {
        if(!(conn.isClosed())) {
            conn.close();
        }
    }
}
