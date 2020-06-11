package com.jack.design.pattern.structural.composite;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-08 10:56
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent catalogComponent = new CourseCatalog("课程主目录", 1);

        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 11);

        CatalogComponent javaCatalog = new CourseCatalog("Java课程目录", 2);
        CatalogComponent javaSe = new Course("JavaSe课程", 100);
        CatalogComponent spring = new Course("spring课程", 200);
        CatalogComponent mall = new Course("mall电商课程", 400);

        javaCatalog.add(javaSe);
        javaCatalog.add(spring);
        javaCatalog.add(mall);

        catalogComponent.add(linuxCourse);
        catalogComponent.add(windowsCourse);
        catalogComponent.add(javaCatalog);

        catalogComponent.print();

    }
}
