package com.pearadmin.pro.modules.not.rest;

import com.pearadmin.pro.common.aop.annotation.Log;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.modules.not.domain.SysInbox;
import com.pearadmin.pro.modules.not.service.SysInboxService;
import io.swagger.annotations.Api;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.modules.not.param.SysInboxRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Api(tags = {"私信"})
@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "inbox")
public class SysInboxController extends BaseController {

    @Resource
    private SysInboxService sysInboxService;

    @GetMapping("page")
    @Log(title = "查询私信")
    @ApiOperation(value = "查询私信")
    public Result page(SysInboxRequest request){
        return success(sysInboxService.page(request));
    }

    @PostMapping("save")
    @Log(title = "新增私信")
    @ApiOperation(value = "新增私信")
    public Result save(@RequestBody SysInbox sysInbox) {
        return auto(sysInboxService.save(sysInbox));
    }

    @PutMapping("edit")
    @Log(title = "修改私信")
    @ApiOperation(value = "修改私信")
    public Result edit(@RequestBody SysInbox sysInbox) {
        return auto(sysInboxService.updateById(sysInbox));
    }

    @DeleteMapping("remove")
    @Log(title = "删除私信")
    @ApiOperation(value = "删除私信")
    public Result remove(@RequestParam String id) {
        return auto(sysInboxService.removeById(id));
    }

    @DeleteMapping("removeBatch")
    @Log(title = "批量删除")
    @ApiOperation(value = "批量删除")
    public Result removeBatch(@RequestParam List<String> ids) {
        return auto(sysInboxService.removeByIds(ids));
    }

}
