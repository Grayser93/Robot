package ru.java.oop.robot;

public abstract class ARobot implements IRobot {
    public ARobot() {
    }

    public ARobot(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
