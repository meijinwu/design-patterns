package com.imooc.design.principle.demeter;

/**
 * @ClassName Boss
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 13:46
 * @Version 1.0
 **/
public class Boss {
    public void commondCheckNumber(TeamLeader teamLeader){
         teamLeader.checkNumberOfCourse();
    }
}
