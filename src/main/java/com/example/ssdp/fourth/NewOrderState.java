package com.example.ssdp.fourth;

public class NewOrderState implements State {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order paid");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship an unpaid order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver an unpaid order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
        order.setState(order.getCancelledState());
    }
}