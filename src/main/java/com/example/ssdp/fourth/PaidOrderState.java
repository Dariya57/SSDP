package com.example.ssdp.fourth;

public class PaidOrderState implements State {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order shipped.");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order must be shipped first.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancelling order.");
        order.setState(order.getCancelledState());
    }
}