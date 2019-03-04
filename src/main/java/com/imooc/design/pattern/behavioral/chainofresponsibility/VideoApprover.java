package com.imooc.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * Created by amaze on 2019-03-04.
 */
public class VideoApprover extends Approver {
    @Override
    public void setNextApprover(Approver approver) {
        super.setNextApprover(approver);
    }

    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视屏,批准");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视屏,不批准,结束");
            return;
        }
    }
}
