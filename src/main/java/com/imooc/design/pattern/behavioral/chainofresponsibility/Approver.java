package com.imooc.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by amaze on 2019-03-04.
 */
public abstract class Approver {
    //包含自己类型的(关键)
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
