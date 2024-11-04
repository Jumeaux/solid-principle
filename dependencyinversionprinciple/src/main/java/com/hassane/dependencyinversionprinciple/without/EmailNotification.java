package com.hassane.dependencyinversionprinciple.without;

public class EmailNotification {
    

    public void sendNotification(String recipient, String message){
        System.out.println("Send notification");
    }
}
