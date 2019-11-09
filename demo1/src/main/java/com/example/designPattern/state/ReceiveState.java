package com.example.designPattern.state;

import org.springframework.core.annotation.Order;

/**
 * @Description: 待收货 状态类
 */
public class ReceiveState implements State {
    private Orders orders;

    public ReceiveState(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void next() {
        orders.setState(new FinishState(orders));
    }

    @Override
    public void action() {
        System.out.println("卖家已发货，待买家确认收货。");
    }
}
