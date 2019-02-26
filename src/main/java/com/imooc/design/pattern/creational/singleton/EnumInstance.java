package com.imooc.design.pattern.creational.singleton;

/**
 * Created by amaze on 2019-02-26.
 */
public enum  EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("amaze print test");
        }
    };
    //没有这个声明,外部调用不到
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
