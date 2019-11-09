package com.example.designPattern.state;

/**
 * 订单操作类
 * 每一种订单状态下都用的同一个订单对象，而订单对象对应的订单状态太对象是当前的订单状态
 * 所以可以抵用同样发方法可以操作
 */
public class Orders {
    // 初始状态为待支付状态
    private State state = new PayState(this);

    public void setState(State state) {
        this.state = state;
    }
    // 订单操作
    public void action(){
        state.action();
    }
    // 修改订单的状态
    public void  next(){
        state.next();
    }
}
