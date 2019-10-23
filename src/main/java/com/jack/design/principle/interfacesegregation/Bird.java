package com.jack.design.principle.interfacesegregation;

/*public class Bird implements AnimalAction {
    @Override
    public void eat() {
        System.out.println("鸟能吃");
    }

    @Override
    public void fly() {
        System.out.println("鸟能飞");
    }

    @Override
    public void swim() {
    }
}*/

public class Bird implements FlyAnimalAction, EatAnimalAction{

    @Override
    public void ead() {
        System.out.println("鸟能吃");
    }

    @Override
    public void fly() {
        System.out.println("鸟能飞");
    }
}
