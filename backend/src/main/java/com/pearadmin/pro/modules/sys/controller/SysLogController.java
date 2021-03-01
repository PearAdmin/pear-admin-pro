package com.pearadmin.pro.modules.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.modules.sys.domain.SysUser;
import com.pearadmin.pro.modules.sys.domain.request.QueryLogRequest;
import com.pearadmin.pro.modules.sys.service.SysLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "log")
public class SysLogController extends BaseController {

    @Resource
    private SysLogService sysLogService;

    @GetMapping("operate")
    public Result operate(Page page, QueryLogRequest request){
        IPage<SysUser> pageInfo = sysLogService.lambdaQuery().page(page);
        return success(pageInfo);
    }

    @GetMapping("login")
    public Result login(Page page, QueryLogRequest request){
        IPage<SysUser> pageInfo = sysLogService.lambdaQuery().page(page);
        return success(pageInfo);
    }
}
