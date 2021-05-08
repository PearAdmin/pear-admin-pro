package com.pearadmin.pro.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.pearadmin.pro.common.web.interceptor.enums.Scope;
import com.pearadmin.pro.common.web.base.domain.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;
import lombok.Data;

@EqualsAndHashCode(callSuper = true)
@Data
@Alias("SysRole")
@ApiModel("用户实体")
public class SysRole extends BaseDomain {

    /**
     * 编号
     */
    @TableId("id")
    @ApiModelProperty("角色编号")
    private String id;

    /**
     * 名称
     */
    @TableField("name")
    @ApiModelProperty("角色名称")
    private String name;

    /**
     * 标识
     */
    @TableField("code")
    @ApiModelProperty("角色标识")
    private String code;

    /**
     * 启用
     */
    @TableField("enable")
    @ApiModelProperty("是否开启")
    private boolean enable;

    /**
     * 排序
     */
    @TableField("sort")
    @ApiModelProperty("排序")
    private Integer sort;

    /**
     * 数据权限
     */
    @TableField("scope")
    @ApiModelProperty("数据权限")
    private Scope scope;

}
