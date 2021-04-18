package com.pearadmin.pro.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pearadmin.pro.common.web.base.page.PageResponse;
import com.pearadmin.pro.modules.job.domain.SysJobLog;
import com.pearadmin.pro.modules.job.param.SysJobLogRequest;

import java.util.List;

public interface SysJobLogService extends IService<SysJobLog> {

    List<SysJobLog> list(SysJobLogRequest request);

    PageResponse<SysJobLog> page(SysJobLogRequest request);
}
