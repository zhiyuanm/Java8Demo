package com.example.designPattern.singleton;

public class DingletonDemo1 {
    public static void main(String[] args) {
        DoubleSingleton singleton = DoubleSingleton.getSingleton();
        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        InnerStaticSingleton singleton2 = InnerStaticSingleton.getSingleton();
    }
}
