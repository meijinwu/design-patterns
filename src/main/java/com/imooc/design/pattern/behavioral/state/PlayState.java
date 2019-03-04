package com.imooc.design.pattern.behavioral.state;

import com.imooc.design.pattern.behavioral.chainofresponsibility.Course;

/**
 * Created by amaze on 2019-03-04.
 */
public class PlayState extends CourseVideoState{
    public void play() {
        System.out.println("正常播放视屏状态");
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
