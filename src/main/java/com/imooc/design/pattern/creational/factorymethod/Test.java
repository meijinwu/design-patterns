package com.imooc.design.pattern.creational.factorymethod;

/**
 * Created by amaze on 2019-02-24.
 */
public class Test {
    public static void main(String[] args){
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory1 = new FEVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFatory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
