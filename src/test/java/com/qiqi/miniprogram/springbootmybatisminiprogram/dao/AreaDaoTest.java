package com.qiqi.miniprogram.springbootmybatisminiprogram.dao;

import com.qiqi.miniprogram.springbootmybatisminiprogram.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    @Qualifier("areaDao")
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }

    @Test
    public void queryAreaById() {
    }

    @Test
    public void insertArea() {
    }

    @Test
    public void updateArea() {
    }

    @Test
    public void deleteArea() {
    }
}