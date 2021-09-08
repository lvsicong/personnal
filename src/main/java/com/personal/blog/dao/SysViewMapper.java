package com.personal.blog.dao;

import com.personal.blog.entity.SysView;
import com.personal.blog.entity.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    int insert(SysView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    int insertSelective(SysView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    List<SysView> selectByExample(SysViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    SysView selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_view
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysView record);
}