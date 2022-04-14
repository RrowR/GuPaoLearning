package com.study.liskovsubstitutionprinciple.simple;

/**
 * @author: Rrow
 * @date: 2022/4/14 22:28
 */
public class Square extends Rectangle{

    protected long lenth;

    public long getLenth() {
        return lenth;
    }

    public void setLenth(long lenth) {
        this.lenth = lenth;
    }

    @Override
    public long getHeight() {
        return getLenth();
    }

    @Override
    public void setHeight(long height) {
        setLenth(height);
    }

    @Override
    public long getWidth() {
        return getLenth();
    }

    @Override
    public void setWidth(long width) {
        setLenth(width);
    }
}
