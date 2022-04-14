package com.study.liskovsubstitutionprinciple.interfaced;

/**
 * @author: Rrow
 * @date: 2022/4/14 23:21
 */
public class Square implements QuadRangle{

    private long lenth;

    public long getLenth() {
        return lenth;
    }

    public void setLenth(long lenth) {
        this.lenth = lenth;
    }

    @Override
    public long getHeight() {
        return lenth;
    }

    @Override
    public long getWidth() {
        return lenth;
    }
}
