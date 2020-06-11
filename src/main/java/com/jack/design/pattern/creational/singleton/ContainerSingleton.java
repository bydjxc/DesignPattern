package com.jack.design.pattern.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @version v1.0
 * @description 容器单例类
 * @date 2019-10-29 15:56
 **/
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){}

    public static void putInstance(String key, Object instance){
        if ((!StringUtils.isEmpty(key)) && instance != null){
            singletonMap.put(key, instance);
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

}
