package com.personal.blog.dao;

import com.personal.blog.entity.ArticleInfo;
import com.personal.blog.entity.ArticleInfoExample;
import java.util.List;

public interface ArticleInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    int insert(ArticleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    int insertSelective(ArticleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    List<ArticleInfo> selectByExample(ArticleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    ArticleInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ArticleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_article_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ArticleInfo record);
}