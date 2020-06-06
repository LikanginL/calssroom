package com.test;

import com.dao.RoomSelect;
import com.model.Room;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RoomSelectTest {

    @Test
    public void selectRoomName() {
        //测试选中存在的辅导室
        RoomSelect exam=new RoomSelect();
        List<Room> list = new ArrayList<>();
        list=exam.selectRoomName("1314");
        boolean result=list.isEmpty();
        //因为存在  所以不为空
        Assert.assertFalse(result);



        //测试选择不存在辅导室
        List<Room> list2 = new ArrayList<>();
        list2=exam.selectRoomName("bucunzai");
        boolean result2=list.isEmpty();
        //因为不存在  所以为空
        Assert.assertTrue(result2);
    }

    @Test
    public void selectAll() {
        //测试选中所有存在的辅导室
        RoomSelect exam=new RoomSelect();
        List<Room> list = new ArrayList<>();
        list=exam.selectAll();
        boolean result=list.isEmpty();
        //因为存在  所以不为空
        Assert.assertFalse(result);
    }

    @Test
    public void selectNull() {
        //测试选中所有没有预约的辅导室
        RoomSelect exam=new RoomSelect();
        List<Room> list = new ArrayList<>();
        list=exam.selectNull();
        boolean result=list.isEmpty();
        //因为存在没有预约的教室  所以不为空
        Assert.assertFalse(result);
    }

    @Test
    public void selectNotNull() {
        //测试选择所有预约的教室
        RoomSelect exam=new RoomSelect();
        List<Room> list = new ArrayList<>();
        list=exam.selectNotNull();
        boolean result=list.isEmpty();
        //因为不存在预约的教室  所以为空
        Assert.assertTrue(result);
    }
}