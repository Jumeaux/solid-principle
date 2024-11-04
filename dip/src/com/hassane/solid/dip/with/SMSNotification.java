package com.hassane.solid.dip.with;

public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {

        System.out.println(String.format("Send SMS : %s  to %s", message,recipient));

    }
    
}
