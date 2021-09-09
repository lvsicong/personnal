package com.personal.blog.controller;

import com.personal.blog.entity.SysLog;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 日志控制器
 * @author 吕思聪
 * @date 2021/9/9 11:19 上午
 */
@RestController
@RequestMapping("/api/log")
public class LogController {
    @ApiOperation("获取日志列表")
    @GetMapping("/list")
    public List<SysLog> listSysLogs(){
        return null;
    }
    @ApiOperation("通过id查询日志信息")
    @ApiImplicitParam(name="id",value = "日志id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public SysLog getSysLogById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增日志")
    @ApiImplicitParam(name = "remark",value = "操作内容",required = true,dataType = "String")
    @PostMapping("")
    public String addSysLog(){
        return null;
    }
    @ApiOperation("更新日志")
    @ApiImplicitParam(name = "id" ,value = "日志id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateSysLog(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除日志")
    @ApiImplicitParam(name = "id" ,value = "日志id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteSysLogById(@PathVariable Long id){
        return null;
    }
}
