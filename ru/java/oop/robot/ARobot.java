package ru.java.oop.robot;

public abstract class ARobot implements IRobot, ITechnic{
    public ARobot() {
    }

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    private String name;
    private IWing wing;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }
}
