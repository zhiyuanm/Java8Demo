package com.example.demo1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        Collections.shuffle(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    @Test
    public void test1(){

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1,o2);
//            }
//        });
        System.out.println("--------------");
        Collections.sort(list,Integer::compare);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
