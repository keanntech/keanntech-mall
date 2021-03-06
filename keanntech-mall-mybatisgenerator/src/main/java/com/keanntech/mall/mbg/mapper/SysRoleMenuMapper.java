package com.keanntech.mall.mbg.mapper;

import com.keanntech.mall.mbg.model.SysRoleMenu;
import com.keanntech.mall.mbg.model.SysRoleMenuExample;
import com.keanntech.mall.mbg.model.SysRoleMenuKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    long countByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int deleteByPrimaryKey(SysRoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    SysRoleMenu selectByPrimaryKey(SysRoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Wed Jun 24 08:38:58 CST 2020
     */
    int updateByPrimaryKey(SysRoleMenu record);
}
