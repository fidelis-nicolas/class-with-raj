package com.cars;

public class SuperCars extends Car implements SuperCarFunctions{

    public SuperCars(int speed, String name, String model) {
        super(speed, name, model);
    }

    @Override
    public void engineType() {
        System.out.println("Super charged turbo engine");
    }

    @Override
    public void transMission(String transmission) {
        System.out.println("Automatic transmission");
    }

    @Override
    public void playMusic(String track, String source) {

    }

    @Override
    public void accelerate(int speed) {

    }

    @Override
    public void brake(int speed) {

    }

    @Override
    public boolean isTurbo(String answer) {
        if(answer.equalsIgnoreCase("yest")){
            return true;
        }
        return false;
    }

    @Override
    public void addNitro(int speed) {
        speed+= 70;
        System.out.println("Current speed is + " + speed);
    }
}
