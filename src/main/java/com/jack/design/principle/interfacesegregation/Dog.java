package com.jack.design.principle.interfacesegregation;

/*public class Dog implements AnimalAction {
    @Override
    public void eat() {
        System.out.println("狗能吃");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("狗能游泳");
    }
}*/

public class Dog implements EatAnimalAction, SwimAnimalAction{

    @Override
    public void ead() {
        System.out.println("狗能吃");
    }

    @Override
    public void swim() {
        System.out.println("狗能游泳");
    }
}

