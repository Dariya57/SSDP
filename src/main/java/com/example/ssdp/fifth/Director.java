package com.example.ssdp.fifth;

public class Director extends Approver {
    private final double APPROVAL_LIMIT = 10000;

    @Override
    public void approveExpense(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Director approved expense: $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}

