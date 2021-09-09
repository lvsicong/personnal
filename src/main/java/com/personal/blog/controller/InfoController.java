package com.personal.blog.controller;

import com.personal.blog.entity.ArticleInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章信息控制器
 * @author 吕思聪
 * @date 2021/9/9 2:58 下午
 */
@RestController
@RequestMapping("/api/info")
public class InfoController {
    @ApiOperation("获取文章信息列表")
    @GetMapping("/list")
    public List<ArticleInfo> listArticleInfo(){
        return null;
    }
    @ApiOperation("通过id查询文章信息")
    @ApiImplicitParam(name="id",value = "文章信息id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public ArticleInfo getArticleInfoById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增文章信息")
    @ApiImplicitParam(name = "summary",value = "文章简介",required = true,dataType = "String")
    @PostMapping("")
    public String addArticleInfo(){
        return null;
    }
    @ApiOperation("更新文章信息")
    @ApiImplicitParam(name = "id" ,value = "文章信息id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateArticleInfo(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除文章信息")
    @ApiImplicitParam(name = "id" ,value = "文章信息id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteArticleInfoById(@PathVariable Long id){
        return null;
    }
}
