package com.sparta.muhammad.util;

public class GetTime {

    public static int getTime(){

        int timeInNano = (int) System.nanoTime();

        return timeInNano;
    }
}
