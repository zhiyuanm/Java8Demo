package com.example.designPattern.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerStaticSingleton {

    private InnerStaticSingleton() {
    }
    public static class InnerClass {
        private static InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
    }
    public static InnerStaticSingleton getSingleton(){
        return InnerClass.innerStaticSingleton;
    }
}
