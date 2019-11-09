package com.example.designPattern.state;

import org.springframework.core.annotation.Order;

public class EvaluateState implements State {

    private Orders orders;

    public EvaluateState(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void next() {
        System.out.println("已经过了");
    }

    @Override
    public void action() {
        System.out.println("交易完成");
    }
}
