package ru.java.oop.robot;

public interface IRobot extends ITechnic {

    void move();
    void stop();
    void flight();
    void talk();

    String getName();
    IWing getWing();
}
