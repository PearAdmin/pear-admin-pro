package com.pearadmin.pro.modules.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pearadmin.pro.common.interceptor.annotation.DataScope;
import com.pearadmin.pro.common.aop.annotation.Log;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.modules.sys.domain.SysRole;
import com.pearadmin.pro.modules.sys.service.SysRoleService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * Describe: 角色控制器
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "role")
public class SysRoleController extends BaseController {

    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("page")
    @DataScope
    @Log(title = "查询角色", describe = "获取角色列表")
    public Result page(Page pageParam){
        IPage<SysRole> pageInfo = sysRoleService.lambdaQuery().page(pageParam);
        return success(pageInfo);
    }
}
