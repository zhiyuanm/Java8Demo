package com.example.designPattern.state;

public class Client {
    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.action();
        orders.next();
        orders.action();
        orders.next();
        orders.action();
        orders.next();
        orders.action();
        orders.next();
        orders.action();
    }
}
