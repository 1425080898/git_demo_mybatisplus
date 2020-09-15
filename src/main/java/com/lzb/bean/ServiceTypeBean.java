package com.lzb.bean;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMultimap;
import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :xiaoLiu
 * @date ：Created in 2020/9/15 9:32
 * @description：
 * @modified By：
 * @version:
 */
@Component
@Data
@Builder
public class ServiceTypeBean {
    private Map<Integer, String> serverTypeMap;
    private Map<Integer, String> statusType;
    private Map<Integer, String> logLevel;

    @PostConstruct
    public void serverTypeMap() {
        //可以让java代码也能够创建一个对象常量映射，来保存一些常量映射的键值对
        serverTypeMap = ImmutableBiMap.<Integer, String>builderWithExpectedSize(3)
                .put(1, "张三").put(2, "李四").put(3, "王五").build();
    }

    @PostConstruct
    public void statusType() {
        statusType = ImmutableBiMap.<Integer, String>builderWithExpectedSize(3)
                .put(0, "全部").put(1, "成功").put(2, "失败").build();
    }
    @PostConstruct
    public void logLevel(){
        logLevel = ImmutableBiMap.<Integer, String>builderWithExpectedSize(3)
                .put(1, "info").put(2, "warm").put(3, "error").build();
    }

}
