package com.pearadmin.pro.modules.sys.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.pearadmin.pro.common.aop.annotation.SysLog;
import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.modules.sys.domain.SysRole;
import com.pearadmin.pro.modules.sys.param.SysRoleRequest;
import com.pearadmin.pro.modules.sys.service.SysRoleService;
import com.pearadmin.pro.modules.sys.validation.SysRoleValid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Api(tags = {"角色"})
@RestController
@RequestMapping(ControllerConstant.PREFIX_SYS + "role")
public class SysRoleController extends BaseController {

    @Resource
    private SysRoleService sysRoleService;

    /**
     * 查询角色列表
     *
     * @param request 查询参数
     *
     * @return {@link SysRole}
     */
    @GetMapping("page")
    @SysLog(title = "查询角色")
    @ApiOperation(value = "查询角色")
    public Result page(SysRoleRequest request){
        return success(sysRoleService.page(request));
    }

    /**
     * 新增角色
     *
     * @param sysRoleValid 参数验证
     * @param sysRole 角色实体
     *
     * @return {@link Boolean}
     */
    @PostMapping("add")
    @SysLog(title = "新增角色")
    @ApiOperation(value = "新增角色")
    public Result add(@RequestBody @Validated SysRoleValid sysRoleValid,
                      @RequestBody SysRole sysRole){
        return auto(sysRoleService.save(sysRole));
    }

    /**
     * 修改角色
     *
     * @param sysRoleValid 参数验证
     * @param sysRole 角色实体
     *
     * @return {@link Boolean}
     */
    @PutMapping("edit")
    @SysLog(title = "修改角色")
    @ApiOperation(value = "修改角色")
    public Result edit(@RequestBody @Validated SysRoleValid sysRoleValid,
                       @RequestBody SysRole sysRole){
        return auto(sysRoleService.updateById(sysRole));
    }

    /**
     * 删除角色
     *
     * @param roleId 角色编号
     *
     * @return {@link Boolean}
     */
    @DeleteMapping("remove")
    @SysLog(title = "删除角色")
    @ApiOperation(value = "删除角色")
    public Result remove(List<String> roleId){
        return auto(sysRoleService.removeByIds(roleId));
    }

}
