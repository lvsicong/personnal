package com.personal.blog.controller;

import com.personal.blog.entity.ArticleComment;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章评论控制器
 * @author 吕思聪
 * @date 2021/9/9 3:06 下午
 */
@RestController
@RequestMapping("/api/articleComment")
public class ArticleCommentController {
    @ApiOperation("获取文章评论列表")
    @GetMapping("/list")
    public List<ArticleComment> listArticleComment(){
        return null;
    }
    @ApiOperation("通过id查询评论内容")
    @ApiImplicitParam(name="id",value = "文章评论id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public ArticleComment getArticleCommentById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增文章评论")
    @ApiImplicitParam(name = "article_id",value = "文章id",required = true,dataType = "Long")
    @PostMapping("")
    public String addArticleComment(){
        return null;
    }
    @ApiOperation("更新文章评论")
    @ApiImplicitParam(name = "id" ,value = "文章评论id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateArticleComment(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除评论信息")
    @ApiImplicitParam(name = "id" ,value = "文章评论id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteArticleCommentById(@PathVariable Long id){
        return null;
    }
}
