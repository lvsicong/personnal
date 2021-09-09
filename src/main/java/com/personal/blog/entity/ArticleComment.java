package com.personal.blog.entity;

import java.util.Date;

public class ArticleComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_comment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_comment.article_id
     *
     * @mbg.generated
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_comment.comment_id
     *
     * @mbg.generated
     */
    private Long commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_comment.create_by
     *
     * @mbg.generated
     */
    private Date createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_comment.is_effective
     *
     * @mbg.generated
     */
    private Boolean isEffective;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_comment.id
     *
     * @return the value of tbl_article_comment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_comment.id
     *
     * @param id the value for tbl_article_comment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_comment.article_id
     *
     * @return the value of tbl_article_comment.article_id
     *
     * @mbg.generated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_comment.article_id
     *
     * @param articleId the value for tbl_article_comment.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_comment.comment_id
     *
     * @return the value of tbl_article_comment.comment_id
     *
     * @mbg.generated
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_comment.comment_id
     *
     * @param commentId the value for tbl_article_comment.comment_id
     *
     * @mbg.generated
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_comment.create_by
     *
     * @return the value of tbl_article_comment.create_by
     *
     * @mbg.generated
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_comment.create_by
     *
     * @param createBy the value for tbl_article_comment.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_comment.is_effective
     *
     * @return the value of tbl_article_comment.is_effective
     *
     * @mbg.generated
     */
    public Boolean getIsEffective() {
        return isEffective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_comment.is_effective
     *
     * @param isEffective the value for tbl_article_comment.is_effective
     *
     * @mbg.generated
     */
    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }
}