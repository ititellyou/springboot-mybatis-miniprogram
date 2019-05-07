package com.qiqi.miniprogram.springbootmybatisminiprogram.dao;

import com.qiqi.miniprogram.springbootmybatisminiprogram.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(4,areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(2);
        assertEquals("东苑", area.getAreaName());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("测试区域");
        area.setCreateTime(new Date());
        area.setPriority(1);
        //将该对象实例添加入库
        int effectedNum = areaDao.insertArea(area);
        //检测影响行数
        assertEquals(1, effectedNum);
        //校验总数是否+1
        List<Area> areaList = areaDao.queryArea();
        assertEquals(3, areaList.size());
    }

    @Test
    public void updateArea() {
        List<Area> areaList = areaDao.queryArea();
        for (Area area : areaList) {
            if ("测试区域".equals(area.getAreaName())) {
                // 对比之前的priority值
                assertEquals(1, area.getPriority().intValue());
                area.setPriority(2);
                int effectedNum = areaDao.updateArea(area);
                assertEquals(1, effectedNum);
            }
        }
    }

    @Test
    @Ignore
    public void deleteArea() {
        List<Area> areaList = areaDao.queryArea();
        for (Area area : areaList) {
            if ("测试区域".equals(area.getAreaName())) {
                int effectedNum = areaDao.deleteArea(area.getAreaId());
                assertEquals(1, effectedNum);
            }
        }
        // 重新获取一次列表，看看总数是否少1
        areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }
}