package com.wujj.demo.dao;

import com.wujj.demo.entity.Area;

import java.util.List;

public interface AreaDao {

    /**
     * 查询区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询区域列表
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

}
