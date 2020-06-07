package com.dao;

import com.util.CloseUtil;
import com.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RoomInsert {
    public int insert(String roomName,String message,long startTime,long endTime) {
        DbUtil dbUtil = new DbUtil();
        Connection conn = null;
        try {
            conn = dbUtil.getConn();
            String sql = "insert into room values(null,?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, roomName);
            pst.setString(2, message);
            pst.setLong(3, startTime);
            pst.setLong(4, endTime);
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            new CloseUtil().close(conn);
        }
        return 0;
    }
}
