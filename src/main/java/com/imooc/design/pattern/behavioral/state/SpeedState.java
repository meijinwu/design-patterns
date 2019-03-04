package com.imooc.design.pattern.behavioral.state;

/**
 * Created by amaze on 2019-03-04.
 */
public class SpeedState extends CourseVideoState{
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("快进播放视屏状态");
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
