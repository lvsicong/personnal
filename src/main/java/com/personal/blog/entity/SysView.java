package com.personal.blog.entity;

import java.util.Date;

public class SysView {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_view.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_view.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_view.create_by
     *
     * @mbg.generated
     */
    private Date createBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_view.id
     *
     * @return the value of sys_view.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_view.id
     *
     * @param id the value for sys_view.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_view.ip
     *
     * @return the value of sys_view.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_view.ip
     *
     * @param ip the value for sys_view.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_view.create_by
     *
     * @return the value of sys_view.create_by
     *
     * @mbg.generated
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_view.create_by
     *
     * @param createBy the value for sys_view.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }
}