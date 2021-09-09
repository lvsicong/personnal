package com.personal.blog.controller;

import com.personal.blog.entity.ArticleCategory;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章分类控制器
 * @author 吕思聪
 * @date 2021/9/9 3:10 下午
 */
@RestController
@RequestMapping("/api/articleCategory")
public class ArticleCategoryController {
    @ApiOperation("获取文章分类列表")
    @GetMapping("/list")
    public List<ArticleCategory> listArticleCategory(){
        return null;
    }
    @ApiOperation("通过id查询分类")
    @ApiImplicitParam(name="id",value = "文章分类id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public ArticleCategory getArticleCategoryById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增文章分类")
    @ApiImplicitParam(name = "article_id",value = "文章id",required = true,dataType = "Long")
    @PostMapping("")
    public String addArticleCategory(){
        return null;
    }
    @ApiOperation("更新文章分类")
    @ApiImplicitParam(name = "id" ,value = "文章分类id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateArticleCategory(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除分类信息")
    @ApiImplicitParam(name = "id" ,value = "文章分类id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteArticleCategoryById(@PathVariable Long id){
        return null;
    }
}
