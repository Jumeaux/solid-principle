package com.hassane.solid.dip.with;

public class PMNotification implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println(String.format("Send a Private Message : %s  to %s", message,recipient));
       
    }

    
} 
