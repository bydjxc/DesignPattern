package com.jack.design.principle.liskovsubstitution;

/**
 * @author kevin
 * @version v1.0
 * @description 正方形
 * @date 2019-10-23 9:26
 **/
public class Square extends Rectangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }

    @Override
    public long getHeight() {
        return length;
    }

    @Override
    public void setHeight(long height) {
        setLength(height);
    }
}
