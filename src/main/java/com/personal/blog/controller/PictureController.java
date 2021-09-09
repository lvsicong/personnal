package com.personal.blog.controller;

import com.personal.blog.entity.ArticlePicture;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章题图控制器
 * @author 吕思聪
 * @date 2021/9/9 3:15 下午
 */
@RestController
@RequestMapping("/api/picture")
public class PictureController {
    @ApiOperation("获取图片列表")
    @GetMapping("/list")
    public List<ArticlePicture> listPicture(){
        return null;
    }
    @ApiOperation("通过id查询图片")
    @ApiImplicitParam(name="id",value = "图片id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public ArticlePicture getPictureById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增文章图片")
    @ApiImplicitParam(name = "picture_url",value = "URL",required = true,dataType = "Long")
    @PostMapping("")
    public String addPicture(){
        return null;
    }
    @ApiOperation("更新文章图片")
    @ApiImplicitParam(name = "id" ,value = "图片id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updatePicture(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除图片")
    @ApiImplicitParam(name = "id" ,value = "图片id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deletePictureById(@PathVariable Long id){
        return null;
    }
}
