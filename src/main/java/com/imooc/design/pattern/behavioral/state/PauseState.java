package com.imooc.design.pattern.behavioral.state;

/**
 * Created by amaze on 2019-03-04.
 */
public class PauseState extends CourseVideoState {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        System.out.println("暂停播放视屏状态");
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
