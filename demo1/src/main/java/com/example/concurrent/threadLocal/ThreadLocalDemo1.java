package com.example.concurrent.threadLocal;

import java.util.concurrent.CountDownLatch;

/**
 * ThreadLocal 每个线程内部维护一个map，从而保证每隔线程保护自己每部的变量副本
 * ThreadLocal 主要是为了解决多线程并发的一种解决思路
 * ThreadLocal 的源码都会加上 private static？(变量在线程间隔离而在方法间共享)
 * ThreadLocal 无法解决线程共享变量更新问题的，所以建议使用static修饰，
 * 是否使用 private 修饰与 ThreadLocal 本身无关。也就是说，
 * 是否使用 private 修饰是一个普遍的问题而不是与 ThreadLocal 有关的一个具体问题
 *
 *
 *
 * 总的来说：每个线程中都有一个自己的ThreadLocalMap类对象，
 * 可以将线程自己的对象保持到其中，各管各的，线程执行期间都可以正确的访问到自己的对象。
 *
 *
 * 引用分类：
 * 强引用：多次DC后也不会被回收
 * 软引用：如果内存空间不足时回收，如果充足时不回收
 * 弱引用：不管内存是否充足，只要出现GC,就会被回收
 * 幽灵引用：
 *
 * Entry是若引用，当Threadlocal对象被回收后，Entry并不能被释放
 * 在执行set方法后，会把Entry键值null的值置为null，从而会使Entry对象被回收
 */
public class ThreadLocalDemo1 {
    public static void main(String[] args) throws Exception{
        // https://www.jianshu.com/p/3ab5f9145ca2
        // https://cloud.tencent.com/developer/article/1442006
//        https://segmentfault.com/q/1010000004986006
        int count = 3;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        InnerClass innerClass = new InnerClass();
        for(int i = 1; i <= count;i++) {
            new Thread(()->{
                for (int j = 0; j < 4; j++) {
                    innerClass.add(String.valueOf(j));
                    innerClass.print();
                }
                innerClass.set("hello world");
                countDownLatch.countDown();
            },"thred-"+i).start();
        }
        countDownLatch.await();
    }
    private static class InnerClass{
        public void add(String string){
            StringBuffer stringBuffer = Counter.threadLocal.get();
            Counter.threadLocal.set(stringBuffer.append(string));
        }
        public void set(String str) {
            Counter.threadLocal.set(new StringBuffer(str));
            System.out.println("set:" + Counter.threadLocal.get().hashCode()+"--"+ //
                    Thread.currentThread().getName()+"--"+ Counter.threadLocal.get().toString());
        }
        public void print(){
            System.out.println("print:"+ Counter.threadLocal.get().hashCode()+"--"+ //
                    Thread.currentThread().getName()+"--"+ Counter.threadLocal.get().toString());
        }
    }
    private static class Counter{
        private static ThreadLocal<StringBuffer> threadLocal = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return new StringBuffer();
            }
        };
    }
}
