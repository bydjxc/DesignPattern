package com.jack.design.pattern.creational.singleton;

/**
 * @author kevin
 * @version v1.0
 * @description 枚举单例
 * @date 2019-10-29 10:06
 **/
public enum EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("print test");
        }
    };
    public Object data;

    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
