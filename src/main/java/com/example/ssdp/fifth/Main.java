package com.example.ssdp.fifth;

public class Main {
    public static void main(String[] args) {
        Approver approverChain = ApprovalChain.createChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(4500, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(8500, "New Computers");
        ExpenseRequest request4 = new ExpenseRequest(15000, "Company Conference");

        approverChain.approveExpense(request1.getAmount());
        approverChain.approveExpense(request2.getAmount());
        approverChain.approveExpense(request3.getAmount());
        approverChain.approveExpense(request4.getAmount());
    }
}


