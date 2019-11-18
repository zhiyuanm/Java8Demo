package com.example.concurrent.threadLocal;

public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        for (int i = 0; i < 4; i++) {
            new Thread(()->{
                // 每隔线程都向threadLocal中设置元素
                threadLocal.set("mazhiyuan");
                threadLocal.set("xxxxxxx");
                System.out.println(threadLocal.get()+"---"+Thread.currentThread().getName()+"---"+
                        threadLocal.hashCode());
            },"线程--"+i).start();
        }
    }
}
