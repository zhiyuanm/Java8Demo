package com.example.designPattern.singleton;

public class DoubleSingleton {
    private DoubleSingleton() {
    }
    private static volatile DoubleSingleton singleton;

    public static DoubleSingleton getSingleton(){
        if(singleton == null) {
            synchronized (DoubleSingleton.class){
                if (singleton == null){
                    singleton = new DoubleSingleton();
                }
            }
        }
        return singleton;
    }
}
