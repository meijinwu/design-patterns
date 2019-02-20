package com.imooc.design.principle.demeter;

/**
 * @ClassName Test
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 13:47
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commondCheckNumber(teamLeader);
    }
}
