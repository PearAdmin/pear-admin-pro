package com.pearadmin.pro.modules.sys.rest;

import com.pearadmin.pro.common.aop.annotation.SysLog;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.modules.sys.domain.SysDataSource;
import com.pearadmin.pro.modules.sys.param.SysDataSourceRequest;
import com.pearadmin.pro.modules.sys.service.SysDataSourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@Api(tags = {"多库"})
@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "dataSource")
public class SysDataSourceController extends BaseController {

    @Resource
    private SysDataSourceService sysDataSourceService;

    /**
     * 查询多库列表
     *
     * @param request 查询参数
     * @return {@link Result}
     */
    @GetMapping("page")
    @SysLog(title = "查询多库")
    @ApiOperation(value = "查询多库")
    public Result page(SysDataSourceRequest request){
       return success(sysDataSourceService.page(request));
    }

    /**
     * 新增多库
     *
     * @param sysDataSource 多库实体
     */
    @PostMapping("save")
    @SysLog(title = "新增多库")
    @ApiOperation(value = "新增多库")
    public Result save(@RequestBody SysDataSource sysDataSource){
        return auto(sysDataSourceService.save(sysDataSource));
    }

    /**
     * 修改多库
     *
     * @param sysDataSource 多库实体
     */
    @PutMapping("edit")
    @SysLog(title = "修改多库")
    @ApiOperation(value = "修改多库")
    public Result edit(@RequestBody SysDataSource sysDataSource){
        return auto(sysDataSourceService.updateById(sysDataSource));
    }

    /**
     * 删除多库
     *
     * @param id 配置多库
     */
    @DeleteMapping("remove")
    @SysLog(title = "删除多库")
    @ApiOperation(value = "删除多库")
    public Result remove(String id){
        return auto(sysDataSourceService.removeById(id));
    }
}
