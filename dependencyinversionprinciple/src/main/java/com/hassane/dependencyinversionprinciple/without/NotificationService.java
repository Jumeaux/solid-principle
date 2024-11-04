package com.hassane.dependencyinversionprinciple.without;

public class NotificationService {
    
    private EmailNotification notification;

    public NotificationService(){
        notification=new EmailNotification();
    }

    public void notifyUser(String recipient,String message){
        notification.sendNotification(recipient,message);
    }
}
