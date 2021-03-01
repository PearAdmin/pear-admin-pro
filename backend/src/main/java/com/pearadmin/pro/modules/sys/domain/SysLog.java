package com.pearadmin.pro.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pearadmin.pro.common.aop.lang.enums.Action;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.base.BaseDomain;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("SysLog")
@TableName("sys_log")
public class SysLog extends BaseDomain {

    /**
     * 编号
     * */
    @TableId("id")
    private String id;

    /**
     * 标题
     * */
    @TableField("title")
    private String title;

    /**
     * 描述
     * */
    @TableField("`describe`")
    private String describe;

    /**
     * 操作人
     * */
    @TableField("operator")
    private String operator;

    /**
     * 操作地址
     * */
    @TableField("address")
    private String address;

    /**
     * 操作
     * */
    @TableField("action")
    private Action action;

    /**
     * 浏览器
     * */
    @TableField("browser")
    private String browser;

    /**
     * 方法
     * */
    @TableField("method")
    private String method;

    /**
     * 接口
     * */
    @TableField("url")
    private String url;

    /**
     * 请求方式
     * */
    @TableField("type")
    private String type;

    /**
     * 参数
     * */
    @TableField("params")
    private String params;

    /**
     * 返回值
     * */
    @TableField("result")
    private String result;

    /**
     * 状态
     * */
    @TableField("state")
    private Boolean state;

    /**
     * 异常信息
     * */
    @TableField("error")
    private String error;

}
