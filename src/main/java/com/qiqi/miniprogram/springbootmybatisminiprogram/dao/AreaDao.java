package com.qiqi.miniprogram.springbootmybatisminiprogram.dao;

import com.qiqi.miniprogram.springbootmybatisminiprogram.entity.Area;

import java.util.List;

/**
 * @author QIQI
 */
public interface AreaDao {
    /**
     * 所有区域
     * @return
     */
    List<Area> queryArea();

    /**
     * 查询
     * @param areaID
     * @return
     */
    Area queryAreaById(int areaID);

    /**
     * 添加
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
