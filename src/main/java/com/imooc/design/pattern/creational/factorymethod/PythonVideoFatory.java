package com.imooc.design.pattern.creational.factorymethod;

/**
 * Created by amaze on 2019-02-24.
 */
public class PythonVideoFatory extends VideoFactory{
    public Video getVideo() {
        return new PythonVideo();
    }
}
