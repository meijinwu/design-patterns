package com.imooc.design.principle.liskovsubstitution;

/**
 * @ClassName Rectangle
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:15
 * @Version 1.0
 **/
public class Rectangle implements Quadrangle {
    private long width;
    private long length;

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
