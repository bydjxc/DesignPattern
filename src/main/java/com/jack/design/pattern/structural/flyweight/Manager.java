package com.jack.design.pattern.structural.flyweight;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-07 15:08
 **/
public class Manager implements Employee {

    private String department;

    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department){
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
