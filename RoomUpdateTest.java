package com.test;

import com.dao.RoomUpdate;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomUpdateTest {

    @Test
    public void update() {
        //测试更新成功
        RoomUpdate exam=new RoomUpdate();
        int result=exam.update("1314",2222);
        Assert.assertNotEquals(0,result);
        //测试更新失败
        int result1=exam.update("bucunzai",2222);
        Assert.assertEquals(0,result1);
    }
}