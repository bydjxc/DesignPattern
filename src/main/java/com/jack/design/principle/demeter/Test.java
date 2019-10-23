package com.jack.design.principle.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commondCheckNumber(teamLeader);
    }
}
