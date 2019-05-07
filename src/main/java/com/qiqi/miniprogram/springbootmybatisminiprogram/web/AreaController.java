package com.qiqi.miniprogram.springbootmybatisminiprogram.web;

import com.qiqi.miniprogram.springbootmybatisminiprogram.entity.Area;
import com.qiqi.miniprogram.springbootmybatisminiprogram.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList",list);
        return modelMap;
    }
    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getareaById(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addarea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }
    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }
    @RequestMapping(value = "/removearea",method = RequestMethod.GET)
    private Map<String,Object> removeArea(Integer areaid){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",areaService.deleteArea(areaid));
        return modelMap;
    }
}
