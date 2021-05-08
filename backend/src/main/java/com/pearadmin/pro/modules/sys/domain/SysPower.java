package com.pearadmin.pro.modules.sys.domain;

import com.pearadmin.pro.common.web.base.domain.TreeDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.pearadmin.pro.common.web.base.domain.BaseDomain;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限模型
 *
 * Author: 就 眠 仪 式
 * CreateTime: 2021/04/01
 * */
@EqualsAndHashCode(callSuper = true)
@Data
@Alias("SysPower")
public class SysPower extends TreeDomain<SysPower> {

    /**
     * 编号
     * */
    @TableId("id")
    private String id;

    /**
     * 权限名称
     * */
    @TableField("name")
    private String name;

    /**
     * 权限标识
     * */
    @TableField("code")
    private String code;

    /**
     * 路由
     * */
    @TableField("path")
    private String path;

    /**
     * 类型
     * */
    @TableField("type")
    private String type;

    /**
     * 图标
     * */
    @TableField("icon")
    private String icon;

    /**
     * 标题
     * */
    @TableField("title")
    private String title;

    /**
     * 排序
     * */
    @TableField("sort")
    private Integer sort;

    /**
     * 链接
     * */
    @TableField("link")
    private String link;

    /**
     * 国际化
     * */
    private String i18n = "sys.user";

    /**
     * 隐藏
     * */
    @TableField(exist = false)
    private Boolean hidden;

    /**
     * 状态
     * */
    @TableField("status")
    private Boolean enable;

}
