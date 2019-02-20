package com.imooc.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:08
 * @Version 1.0
 **/
public class VideoFactory {

    private Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
