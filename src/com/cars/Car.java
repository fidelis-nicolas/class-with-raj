package com.cars;

public abstract class Car{
    private int speed;
    private String name;
    private String model;
    private final int tyres = 6;


    public Car(){

    }

    public Car(int speed, String name, String model) {
        this.speed = speed;
        this.name = name;
        this.model = model;
    }

    //Abstract method
    public abstract void engineType();
    public abstract void transMission(String transmission);


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
