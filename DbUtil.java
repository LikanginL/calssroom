package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
    private String dbUrl = "jdbc:mysql://rm-bp1g528p493808wo4xo.mysql.rds.aliyuncs.com:3306/class_room_system?userSSL=false";
    private String dbUserName = "ad";
    private String dbUserPwd = "Likanglin1999";

    //获取数据库的连接
    public Connection getConn() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbUrl,dbUserName,dbUserPwd);
        return conn;
    }
}
