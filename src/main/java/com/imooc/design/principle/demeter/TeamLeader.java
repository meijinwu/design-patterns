package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeamLeader
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 13:43
 * @Version 1.0
 **/
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0;i< 20 ;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是"+courseList.size());
    }
}
