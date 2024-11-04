package com.hassane.solid.dip.with;

public class UserNotifier {
    
    private final NotificationService notificationService;

    public UserNotifier (NotificationService notificationService){
        this.notificationService=notificationService;
    }


    public void notify(String recipeint,String message){

        notificationService.sendNotification(recipeint, message);
    }
}
