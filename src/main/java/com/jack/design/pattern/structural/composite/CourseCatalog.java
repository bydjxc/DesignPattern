package com.jack.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version v1.0
 * @description 课程目录
 * @date 2019-11-08 10:52
 **/
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        super.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent item : items) {
            if (level != null){
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
