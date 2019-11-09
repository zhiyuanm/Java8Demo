package com.example.demo2.exec;

import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo2 {
    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("nkjfndsjg");
        list.add("dsagfa");
        list.add("uyouy");
        list.add("were");
        TreeSet<Object> objects = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

    }
}
