package com.jack.design.pattern.creational.prototype.clone;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-31 9:19
 **/
public class Pig implements Serializable,Cloneable{
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Pig pig = (Pig) super.clone();
//        //深克隆
//        pig.birthday = ((Date) pig.birthday.clone());
//        return pig;
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
