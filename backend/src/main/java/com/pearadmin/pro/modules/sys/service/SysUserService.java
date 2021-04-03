package com.pearadmin.pro.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pearadmin.pro.modules.sys.domain.SysRole;
import com.pearadmin.pro.modules.sys.domain.SysUser;

import java.util.List;

public interface SysUserService extends IService<SysUser> {

    /**
     * 获取用户角色
     *
     * @param userId 用户编号
     * */
    public List<SysRole> role(String userId);

    /**
     * 获取用户列表
     *
     * @param sysUser 参数实体
     * */
    public List<SysUser> list(SysUser sysUser);

    /**
     * 获取用户列表 (分页)
     *
     * @param sysUser 参数实体
     * */
    public List<SysUser> page(SysUser sysUser);
}
