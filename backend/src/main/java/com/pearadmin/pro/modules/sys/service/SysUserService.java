package com.pearadmin.pro.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pearadmin.pro.common.web.base.page.PageResponse;
import com.pearadmin.pro.modules.sys.domain.SysPower;
import com.pearadmin.pro.modules.sys.domain.SysRole;
import com.pearadmin.pro.modules.sys.domain.SysUser;
import com.pearadmin.pro.modules.sys.param.SysUserRequest;
import java.util.List;

/**
 * 用户服务
 *
 * Author: 就 眠 仪 式
 * CreateTime: 2021/03/28
 * */
public interface SysUserService extends IService<SysUser> {

    /**
     * 获取用户角色
     *
     * @param userId 用户编号
     *
     * @return {@link SysRole}
     * */
    List<SysRole> role(String userId);

    /**
     * 获取用户列表
     *
     * @param request 参数实体
     *
     * @return {@link SysUser}
     * */
    List<SysUser> list(SysUserRequest request);

    /**
     * 获取用户列表 (分页)
     *
     * @param request 查询参数
     *
     * @return {@link SysUser}
     * */
    PageResponse<SysUser> page(SysUserRequest request);

    /**
     * 获取用户菜单
     *
     * @param userId 用户编号
     *
     * @return {@link SysUser}
     * */
    List<SysPower> menu(String userId);

    /**
     * 获取用户权限
     *
     * @param userId 用户编号
     *
     * @return {@link SysPower}
     */
    List<SysPower> power(String userId);
}
