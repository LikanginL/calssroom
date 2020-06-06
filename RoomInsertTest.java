package com.test;

import com.dao.RoomInsert;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomInsertTest {

    @Test
    public void insert() {
        //测试新增辅导室
        RoomInsert exam=new RoomInsert();
        int result=exam.insert("111","a room",0,0);
        Assert.assertNotEquals(0,result);
    }
}