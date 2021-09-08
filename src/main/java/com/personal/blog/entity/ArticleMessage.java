package com.personal.blog.entity;

import java.util.Date;

public class ArticleMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_message.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_message.article_id
     *
     * @mbg.generated
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_message.message_id
     *
     * @mbg.generated
     */
    private Long messageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_message.create_by
     *
     * @mbg.generated
     */
    private Date createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_message.is_effective
     *
     * @mbg.generated
     */
    private Boolean isEffective;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_message.id
     *
     * @return the value of tbl_article_message.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_message.id
     *
     * @param id the value for tbl_article_message.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_message.article_id
     *
     * @return the value of tbl_article_message.article_id
     *
     * @mbg.generated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_message.article_id
     *
     * @param articleId the value for tbl_article_message.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_message.message_id
     *
     * @return the value of tbl_article_message.message_id
     *
     * @mbg.generated
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_message.message_id
     *
     * @param messageId the value for tbl_article_message.message_id
     *
     * @mbg.generated
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_message.create_by
     *
     * @return the value of tbl_article_message.create_by
     *
     * @mbg.generated
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_message.create_by
     *
     * @param createBy the value for tbl_article_message.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_message.is_effective
     *
     * @return the value of tbl_article_message.is_effective
     *
     * @mbg.generated
     */
    public Boolean getIsEffective() {
        return isEffective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_message.is_effective
     *
     * @param isEffective the value for tbl_article_message.is_effective
     *
     * @mbg.generated
     */
    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }
}