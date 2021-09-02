package com.company;

public class Singletone {
    public static int counter = 0;
    private static Singletone instance;
    private Singletone() {
        counter++;
        System.out.println("singleon");
    }

     public static Singletone getInstance() {
        if(instance == null) {
            instance = new Singletone();
        }
        return instance;
    }
}
