package com.pearadmin.pro.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.pearadmin.pro.common.web.base.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

/**
 * 角色部门模型
 *
 * Author: 就 眠 仪 式
 * CreateTime: 2021/03/23
 * */
@EqualsAndHashCode(callSuper = true)
@Data
@Alias("SysRoleDept")
public class SysRoleDept extends BaseDomain {

    /**
     * 编号
     */
    @TableId("id")
    private String id;

    /**
     * 角色编号
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 部门编号
     */
    @TableField("dept_id")
    private String deptId;

}
