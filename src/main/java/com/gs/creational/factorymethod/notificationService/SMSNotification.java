package com.gs.creational.factorymethod.notificationService;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notifications");
    }
}
