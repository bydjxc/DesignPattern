package com.jack.design.pattern.behavioral.templatemethod;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-12-05 10:08
 **/
public abstract class ACourse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (needWriteArtical()){
            this.writeArtical();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArtical(){
        System.out.println("编写手记");
    }
    //钩子方法
    protected boolean needWriteArtical(){
        return false;
    }

    abstract void packageCourse();
}
