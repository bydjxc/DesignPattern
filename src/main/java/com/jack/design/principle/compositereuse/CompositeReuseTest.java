package com.jack.design.principle.compositereuse;

/**
 * @author kevin
 * @version v1.0
 * @description 测试
 * @date 2019-10-23 10:38
 **/
public class CompositeReuseTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new ORACLEConnection());
        productDao.addProduct();
    }
}
