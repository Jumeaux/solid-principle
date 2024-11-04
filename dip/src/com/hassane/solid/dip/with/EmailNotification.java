package com.hassane.solid.dip.with;

public class EmailNotification implements NotificationService {


    @Override
    public void sendNotification(String recipient, String message) {
       System.out.println(String.format("Send Email : %s  to %s", message,recipient));
    }
    
}
