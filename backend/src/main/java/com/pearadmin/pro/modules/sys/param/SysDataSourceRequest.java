package com.pearadmin.pro.modules.sys.param;

import com.pearadmin.pro.common.web.base.page.PageRequest;
import lombok.Data;

@Data
public class SysDataSourceRequest extends PageRequest {

    /**
     * 数据源名称
     * */
    private String name;
}
