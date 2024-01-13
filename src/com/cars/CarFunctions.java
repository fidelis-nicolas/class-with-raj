package com.cars;

import java.util.List;
import java.util.Map;

public interface CarFunctions{

    public int sideMirror = 2;

    public void playMusic(String track, String source);
    public void accelerate(int speed);
    public void brake(int speed);
}
