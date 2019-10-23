package com.jack.design.principle.liskovsubstitution;

/**
 * @author kevin
 * @version v1.0
 * @description 长方形
 * @date 2019-10-23 9:22
 **/
public class Rectangle implements Quadrangle{
    private long height;
    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
