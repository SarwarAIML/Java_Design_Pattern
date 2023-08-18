package com.gs.creational.factorymethod.notificationService;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email Notifications");
    }
}
