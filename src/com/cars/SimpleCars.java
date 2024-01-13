package com.cars;

public  class SimpleCars extends Car implements CarFunctions{
    public SimpleCars(int speed, String name, String model) {
        super(speed, name, model);
    }

    @Override
    public void engineType(){
        System.out.println("V6 engine is set for this car");
    }

    @Override
    public void transMission(String transmission) {
        System.out.println("Can transmission is " + transmission);
    }


    @Override
    public void playMusic(String track, String source) {
        System.out.println("Playing " + track + "From " + source);
    }

    @Override
    public void accelerate(int speed) {
        speed+= 20;
        System.out.println("Current speed is " + speed);
    }

    @Override
    public void brake(int speed) {
        speed -=20;
        System.out.println("Current speed " + speed);
    }
}
