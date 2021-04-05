package com.pearadmin.pro.modules.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pearadmin.pro.modules.sys.domain.SysDictType;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SysDictTypeMapper extends BaseMapper<SysDictType> {

    List<SysDictType> selectList();
}
