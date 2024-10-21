package com.example.ssdp.fifth;

public class ApprovalChain {
    public static Approver createChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        return teamLead;
    }
}
