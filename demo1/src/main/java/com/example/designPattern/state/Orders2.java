package com.example.designPattern.state;

public class Orders2 {
    private final int PAY = 0;//已下单，待支付
    private final int SEND = 1;//待发货
    private final int RECEIVE = 2;//待收货
    private final int FINISH = 3;//交易完成

    private int state = PAY;//初始状态  已下单，待支付

    //订单的动作 随内部状态而变化，根据不同的订单状态做不同的操作
    public void action() {
        if (state == PAY) {
            System.out.println("已下单，待买家支付。");
        }else if (state == SEND) {
            System.out.println("已支付，待卖家发货。");
        }else if (state == RECEIVE) {
            System.out.println("卖家已发货，待买家确认收货。");
        }else if (state == FINISH) {
            System.out.println("买家已确认收货，交易完成。");
        }
    }
    // 当做完操纵后，需要把当前的操作修改下一个订单的状态。修改目前的状态
    public void next(){
        if (state == PAY) {
            state = SEND;
        }else if (state == SEND) {
            state = RECEIVE;
        }else if (state == RECEIVE) {
            state = FINISH;
        }else if (state == FINISH) {
            throw new RuntimeException("订单已完成");
        }
    }
}
