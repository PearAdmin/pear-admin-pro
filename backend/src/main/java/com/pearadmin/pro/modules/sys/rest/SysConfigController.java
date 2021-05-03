package com.pearadmin.pro.modules.sys.rest;

import com.pearadmin.pro.common.aop.annotation.SysLog;
import com.pearadmin.pro.modules.sys.domain.SysConfig;
import io.swagger.annotations.Api;
import com.pearadmin.pro.common.web.domain.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.pearadmin.pro.modules.sys.param.SysConfigRequest;
import com.pearadmin.pro.modules.sys.service.SysConfigService;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.base.BaseController;
import javax.annotation.Resource;
import java.util.List;

/**
 * 配置控制器
 *
 * Author: 就 眠 仪 式
 * CreateTime: 2021/04/01
 * */
@Api(tags = {"配置"})
@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "config")
public class SysConfigController extends BaseController {

    @Resource
    private SysConfigService sysConfigService;

    /**
     * 查询配置列表
     *
     * @param request 查询参数
     * @return {@link Result}
     */
    @GetMapping("page")
    @SysLog(title = "配置列表")
    @ApiOperation(value = "配置列表")
    public Result page(SysConfigRequest request){
        return success(sysConfigService.page(request));
    }

    /**
     * 新增配置
     *
     * @param sysConfig 配置实体
     */
    @PostMapping("save")
    @SysLog(title = "新增配置")
    @ApiOperation(value = "新增配置")
    public Result save(@RequestBody SysConfig sysConfig) {
        return auto(sysConfigService.save(sysConfig));
    }

    /**
     * 修改配置
     *
     * @param sysConfig 配置实体
     */
    @PutMapping("edit")
    @SysLog(title = "修改配置")
    @ApiOperation(value = "修改配置")
    public Result edit(@RequestBody SysConfig sysConfig) {
        return auto(sysConfigService.updateById(sysConfig));
    }

    /**
     * 删除配置
     *
     * @param id 配置编号
     */
    @DeleteMapping("remove")
    @SysLog(title = "删除配置")
    @ApiOperation(value = "删除配置")
    public Result remove(@RequestParam String id){
        return auto(sysConfigService.removeById(id));
    }

    /**
     * 删除配置
     *
     * @param ids 配置编号
     * */
    @DeleteMapping("removeBatch")
    @SysLog(title = "删除配置")
    @ApiOperation(value = "删除配置")
    public Result removeBatch(@RequestParam List<String> ids) { return auto(sysConfigService.removeByIds(ids)); }

}
