package com.jack.design.principle.compositereuse;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-23 10:22
 **/
public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    
    public void addProduct(){
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }
}
