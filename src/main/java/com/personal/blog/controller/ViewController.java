package com.personal.blog.controller;

import com.personal.blog.entity.SysView;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 浏览量控制器
 * @author 吕思聪
 * @date 2021/9/9 2:27 下午
 */
@RestController
@RequestMapping("/api/view")
public class ViewController {
    @ApiOperation("获取浏览量列表")
    @GetMapping("/list")
    public List<SysView> listSysView(){
        return null;
    }
    @ApiOperation("通过id查询浏览量信息")
    @ApiImplicitParam(name="id",value = "浏览量id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public SysView getSysViewById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增浏览信息")
    @ApiImplicitParam(name = "ip",value = "操作ip",required = true,dataType = "String")
    @PostMapping("")
    public String addSysView(){
        return null;
    }
    @ApiOperation("更新浏览信息")
    @ApiImplicitParam(name = "id" ,value = "浏览量id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateSysView(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除浏览信息")
    @ApiImplicitParam(name = "id" ,value = "浏览量id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteSysViewById(@PathVariable Long id){
        return null;
    }
}
