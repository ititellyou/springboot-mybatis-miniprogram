package com.qiqi.miniprogram.springbootmybatisminiprogram.service;

import com.qiqi.miniprogram.springbootmybatisminiprogram.entity.Area;

import java.util.List;

public interface AreaService {
	/**
	 * 获取区域列表
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * 通过区域ID获取区域信息
	 * @param areaId
	 * @return
	 */
	Area getAreaById(int areaId);

	/**
	 * 增加区域信息
	 * @param area
	 * @return
	 */
	boolean addArea(Area area);

	/**
	 * 修改区域信息
	 * @param area
	 * @return
	 */
	boolean modifyArea(Area area);

	/**
	 * 删除区域信息
	 * @param areaID
	 * @return
	 */
	boolean deleteArea(int areaID);
}