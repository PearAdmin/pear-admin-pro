package com.pearadmin.pro.common.web.base;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.HashMap;
import java.util.Map;

/**
 * Describe: Bean Cache
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
public abstract class BaseCache<T> {

    /**
     * 容器
     * */
    public Map<String,T> cache = new HashMap<>();

    /**
     * 获取
     * */
    public T get(String key){

        return cache.get(key);
    }

    /**
     * 加载
     * */
    public abstract Map<String,T> load();

    /**
     * 刷新
     * */
    @Scheduled(fixedDelay = 5000)
    public void time(){
        cache = load();
    }
}
