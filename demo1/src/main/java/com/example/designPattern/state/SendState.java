package com.example.designPattern.state;
/**
 * @Description: 待发货 状态类
 */
public class SendState implements State {

    private Orders orders;

    public SendState(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void next() {
        orders.setState(new ReceiveState(orders));
    }

    @Override
    public void action() {
        System.out.println("已支付，待卖家发货。");
    }
}
