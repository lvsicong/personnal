package com.personal.blog.controller;

import com.personal.blog.entity.ArticleContent;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章内容控制器
 * @author 吕思聪
 * @date 2021/9/9 3:02 下午
 */
@RestController
@RequestMapping("/api/content")
public class ContentController {
    @ApiOperation("获取文章内容列表")
    @GetMapping("/list")
    public List<ArticleContent> listArticleContent(){
        return null;
    }
    @ApiOperation("通过id查询文章内容")
    @ApiImplicitParam(name="id",value = "文章内容id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public ArticleContent getArticleInfoById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增文章内容")
    @ApiImplicitParam(name = "content",value = "内容",required = true,dataType = "String")
    @PostMapping("")
    public String addArticleContent(){
        return null;
    }
    @ApiOperation("更新文章内容")
    @ApiImplicitParam(name = "id" ,value = "文章内容id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateArticleContent(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除内容信息")
    @ApiImplicitParam(name = "id" ,value = "文章内容id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteArticleContentById(@PathVariable Long id){
        return null;
    }
}
