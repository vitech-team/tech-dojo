package com.vitech.playground.gofpatterns.behavioral.chainofresponsibility.model;

public class HeadOfUnit extends Manager {
    @Override
    public void processRequest(RaiseRequest raiseRequest) {
        if (raiseRequest.percentageIncrease() >= 2.0 && raiseRequest.percentageIncrease() < 5.0) {
            System.out.println("Congratulations " + raiseRequest.employee() + "! Your request was approved. " +
                    "Now your salary is $" +
                    (raiseRequest.currentSalary() + raiseRequest.currentSalary() * raiseRequest.percentageIncrease() / 100));
        } else {
            nextManager.processRequest(raiseRequest);
        }
    }
}
