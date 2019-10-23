package com.jack.design.principle.compositereuse;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-23 10:34
 **/
public class ORACLEConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "ORACLE 数据库连接";
    }
}
