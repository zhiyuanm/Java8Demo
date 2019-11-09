package com.example.designPattern.state;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * 交易完成状态了
 */
public class FinishState implements State{
    private Orders orders;

    public FinishState(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void next() {
//        throw new RuntimeException("订单已完成");
        orders.setState(new EvaluateState(orders));
    }

    @Override
    public void action() {
        System.out.println("买家已确认收货，交易完成。");
    }
}
