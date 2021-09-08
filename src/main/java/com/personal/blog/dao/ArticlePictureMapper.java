package com.personal.blog.dao;

import com.personal.blog.entity.ArticlePicture;
import com.personal.blog.entity.ArticlePictureExample;
import java.util.List;

public interface ArticlePictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    int insert(ArticlePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    int insertSelective(ArticlePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    List<ArticlePicture> selectByExample(ArticlePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    ArticlePicture selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ArticlePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_picture
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ArticlePicture record);
}