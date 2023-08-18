package com.gs.creational.factorymethod.notificationService;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push Notifications");
    }
}
