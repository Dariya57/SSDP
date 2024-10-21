package com.example.ssdp.fifth;

public class Manager extends Approver {
    private final double APPROVAL_LIMIT = 5000;

    @Override
    public void approveExpense(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Manager approved expense: $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}
