package com.example.string;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringDemo {
    @Test
    public void test(){
        String x = new String("abc");
    }

    @Test
    public void test2(){
        // 线程安全的
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }

    @Test
    public void test3(){
        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add("mazhiyuan");
        stringJoiner.add("avc");
        stringJoiner.add("kn");
        System.out.println(stringJoiner.toString());
    }
    @Test
    public void test4(){
        List<String> list = Arrays.asList("a","b","c");
        List<String> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);
        // Collector<CharSequence, ?, String> joining = Collectors.joining(":");
        // https://www.jianshu.com/p/7eaa0969b424
    }
}
