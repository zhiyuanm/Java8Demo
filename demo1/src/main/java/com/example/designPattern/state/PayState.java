package com.example.designPattern.state;

/**
 * 待支付状态类
 */
public class PayState implements State {

    private Orders orders;

    public PayState(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void next() {
        orders.setState(new SendState(orders));
    }

    @Override
    public void action() {
        System.out.println("卖家已下单，待支付");
    }
}
