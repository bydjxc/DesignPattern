package com.jack.design.pattern.structural.composite;

/**
 * @author kevin
 * @version v1.0
 * @description 目录抽象
 * @date 2019-11-08 10:46
 **/
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
