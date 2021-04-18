package com.pearadmin.pro.modules.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pearadmin.pro.common.web.base.domain.BaseDomain;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 数据字典模型
 *
 * Author: 就 眠 仪 式
 * CreateTime: 2021/03/27
 * */
@Data
@Alias("SysDict")
@TableName("sys_dict")
public class SysDict extends BaseDomain {

    /**
     * 编号
     * */
    private String id;

    /**
     * 名称
     * */
    private String name;

    /**
     * 标识
     * */
    private String code;

    /**
     * 启用
     * */
    private boolean enable;

    /**
     * 对应
     * */
    @TableField(exist = false)
    private List<SysDictData> children;

}
