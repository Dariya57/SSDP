package com.example.ssdp.fourth;

public class CancelledOrderState implements State {
    private Order order;

    public CancelledOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Cannot pay for a canceled order.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship a canceled order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver a canceled order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is already canceled.");
    }
}
