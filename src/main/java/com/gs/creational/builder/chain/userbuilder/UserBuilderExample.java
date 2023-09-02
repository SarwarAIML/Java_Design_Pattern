package com.gs.creational.builder.chain.userbuilder;


public class UserBuilderExample {

    public static void main(String[] args) {


        User user = User.newBuilder("Ghulam","Sarwar").build();
        System.out.println(user);


        User user1 = User.newBuilder("Ghulam","Sarwar")
                .setAge(30)
                .setAddress("Bangalore")
                .setPhone("1234567")
                .build();
        System.out.println(user1);

    }
}
