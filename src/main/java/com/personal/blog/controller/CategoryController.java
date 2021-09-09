package com.personal.blog.controller;

import com.personal.blog.entity.CategoryInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类信息控制器
 * @author 吕思聪
 * @date 2021/9/8 7:10 下午
 */
@RestController
@RequestMapping("/api/CategoryInfo")
public class CategoryController {

    @ApiOperation("获取所有分类信息")
    @GetMapping("/list")
    public List<CategoryInfo> listAllCategoryInfo(){
        return null;
    }
    @ApiOperation("通过id获得某一条分类信息")
    @ApiImplicitParam(name="id",value = "分类id",required = true,dataType = "Long")
    @GetMapping("/{id}")
    public CategoryInfo getCategoryInfoById (@PathVariable Long id){
        return null;
    }
    @ApiOperation("增添一条分类信息")
    @ApiImplicitParam(name = "name",value = "分类信息",required = true,dataType = "String")
    @PostMapping("")
    public String addCategoryInfo(){
        return null;
    }
    @ApiOperation("通过id修改一条分类信息")
    @ApiImplicitParam(name="id",value = "分类id",required = true,dataType = "Long")
    @PutMapping("/{id}")
    public String updateCategoryInfo(@PathVariable Long id){
        return null;
    }
    @ApiOperation("通过id删除分类信息")
    @ApiImplicitParam(name = "id",value = "分类id",required = true,dataType = "Long")
    @DeleteMapping("/{id}")
    public String deleteCategoryInfo(@PathVariable Long id){
        return null;
    }
}
