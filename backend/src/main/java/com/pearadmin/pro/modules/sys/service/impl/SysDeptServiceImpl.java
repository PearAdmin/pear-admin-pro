package com.pearadmin.pro.modules.sys.service.impl;

import com.pearadmin.pro.modules.sys.domain.SysDept;
import com.pearadmin.pro.modules.sys.domain.SysPower;
import com.pearadmin.pro.modules.sys.repository.SysDeptRepository;
import com.pearadmin.pro.modules.sys.service.SysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptRepository sysDeptRepository;

    @Override
    public List<SysDept> tree() {
        return toTree(sysDeptRepository.selectList(),"0");
    }

    public List<SysDept> toTree(List<SysDept> sysDept, String parent) {
        List<SysDept> list = new ArrayList<>();
        for (SysDept dept : sysDept) {
            if (parent.equals(dept.getParent())) {
                dept.setChildren(toTree(sysDept, dept.getId()));
                list.add(dept);
            }
        }
        return list;
    }
}
