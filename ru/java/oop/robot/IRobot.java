package ru.java.oop.robot;

public interface IRobot {

    default void move(){
        System.out.println("default move = " + getName());
    };

    void stop();

    void flight();

    void talk();

    String getName();

    IWing getWing();
}
