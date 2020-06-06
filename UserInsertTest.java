package com.test;

import com.dao.UserInsert;
import org.junit.Assert;
import org.junit.Test;

public class UserInsertTest {

    @Test
    public void insert() {
        //测试加入新用户
        UserInsert exam=new UserInsert();
        int result=exam.insert("1234","1234");
        Assert.assertNotEquals(0,result);
    }
}