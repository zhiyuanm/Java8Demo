package com.example.demo2.OptionalTest;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.testng.annotations.Test;
import sun.management.counter.Variability;

import javax.swing.text.html.Option;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Optional;

/**
 * empty() 代表所有null包装起来的Optional
 * isPresent()
 * ifPresent(Consumer consumer)
 * orElse(value)
 * orElseGet(Supplier supplier)
 * orElseThrow()
 * map(Function)
 * flatMap()：
 * get()
 */
public class OptionalMethod {


    @Test
    public void test1(){
        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional==Optional.<String>empty());
    }




}
