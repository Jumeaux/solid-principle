package com.hassane.solid.dip.without;

public class NotificationService {
    
    private EmailNotification notification;

    public NotificationService(){
        notification=new EmailNotification();
    }

    public void notify(String recipient,String message){
        notification.sendNotification(recipient,message);
    }
}
