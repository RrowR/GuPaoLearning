package com.study.liskovsubstitutionprinciple.interfaced;

/**
 * @author: Rrow
 * @date: 2022/4/14 23:16
 */
public class Ranctangle implements QuadRangle{

    private long width;
    private long height;

    public void setWidth(long width) {
        this.width = width;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public long getHeight() {
        return height;
    }

    @Override
    public long getWidth() {
        return width;
    }
}
