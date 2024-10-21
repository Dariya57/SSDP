package com.example.ssdp.first;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment: " + amount);
    }
}