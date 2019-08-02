package com.jack.design.principle.singleresponsibility;

/**
 * @Author: Kevin
 * @Description:<br>
 * @Date Created in 9:51 2019/8/2
 * @Modified By
 * @Version 1.0
 */
public class Mehtod {
    public void updateUserInfo(String username, String address){
        System.out.println("修改姓名和地址");
    }
    public void updateUsername(){
        System.out.println("修改姓名");
    }
    public void updateAddress(){
        System.out.println("修改地址");
    }
}
