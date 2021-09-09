package com.personal.blog.controller;

import com.personal.blog.entity.Comment;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 留言评论控制器
 * @author 吕思聪
 * @date 2021/9/9 2:32 下午
 */
@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @ApiOperation("获取评论列表")
    @GetMapping("/list")
    public List<Comment> listComment(){
        return null;
    }
    @ApiOperation("通过id查询评论信息")
    @ApiImplicitParam(name="id",value = "评论id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id){
        return null;
    }
    @ApiOperation("新增评论")
    @ApiImplicitParam(name = "content",value = "留言内容",required = true,dataType = "String")
    @PostMapping("")
    public String addComment(){
        return null;
    }
    @ApiOperation("更新评论")
    @ApiImplicitParam(name = "id" ,value = "评论id" ,required = true ,dataType = "String")
    @PostMapping("/{id}")
    public String updateComment(@PathVariable Long id){
        return null;
    }
    @ApiOperation("删除评论")
    @ApiImplicitParam(name = "id" ,value = "评论id" ,required = true ,dataType = "String")
    @DeleteMapping("/{id}")
    public String deleteCommentById(@PathVariable Long id){
        return null;
    }
}
