package com.personal.blog.entity;

import java.util.Date;

public class ArticleSort {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.sort_id
     *
     * @mbg.generated
     */
    private Long sortId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.article_id
     *
     * @mbg.generated
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.create_by
     *
     * @mbg.generated
     */
    private Date createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.modified_by
     *
     * @mbg.generated
     */
    private Date modifiedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_sort.is_effective
     *
     * @mbg.generated
     */
    private Boolean isEffective;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.id
     *
     * @return the value of tbl_article_sort.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.id
     *
     * @param id the value for tbl_article_sort.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.sort_id
     *
     * @return the value of tbl_article_sort.sort_id
     *
     * @mbg.generated
     */
    public Long getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.sort_id
     *
     * @param sortId the value for tbl_article_sort.sort_id
     *
     * @mbg.generated
     */
    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.article_id
     *
     * @return the value of tbl_article_sort.article_id
     *
     * @mbg.generated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.article_id
     *
     * @param articleId the value for tbl_article_sort.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.create_by
     *
     * @return the value of tbl_article_sort.create_by
     *
     * @mbg.generated
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.create_by
     *
     * @param createBy the value for tbl_article_sort.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.modified_by
     *
     * @return the value of tbl_article_sort.modified_by
     *
     * @mbg.generated
     */
    public Date getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.modified_by
     *
     * @param modifiedBy the value for tbl_article_sort.modified_by
     *
     * @mbg.generated
     */
    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_sort.is_effective
     *
     * @return the value of tbl_article_sort.is_effective
     *
     * @mbg.generated
     */
    public Boolean getIsEffective() {
        return isEffective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_sort.is_effective
     *
     * @param isEffective the value for tbl_article_sort.is_effective
     *
     * @mbg.generated
     */
    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }
}