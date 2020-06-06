package com.test;

import com.dao.RoomDelete;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomDeleteTest {

    @Test
    public void delete() {
        //测试删除存在的辅导室
        RoomDelete exam=new RoomDelete();
        int result=exam.delete("1314");
        Assert.assertNotEquals(0,result);
        //测试删除不存在的辅导室
        int result1=exam.delete("null");
        Assert.assertEquals(0,result1);
    }


}