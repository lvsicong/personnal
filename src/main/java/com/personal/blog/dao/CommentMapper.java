package com.personal.blog.dao;

import com.personal.blog.entity.Comment;
import com.personal.blog.entity.CommentExample;
import java.util.List;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Comment record);
}