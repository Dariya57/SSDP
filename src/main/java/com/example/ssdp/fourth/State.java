package com.example.ssdp.fourth;

public interface State {
    void payOrder();
    void shipOrder();
    void deliverOrder();
    void cancelOrder();
}