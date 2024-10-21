package com.example.ssdp.fifth;

public class TeamLead extends Approver {
    private final double APPROVAL_LIMIT = 1000;

    @Override
    public void approveExpense(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("TeamLead approved expense: $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}
