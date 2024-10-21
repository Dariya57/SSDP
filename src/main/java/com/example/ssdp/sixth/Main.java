package com.example.ssdp.sixth;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new RegularUser(mediator, "Alice");
        User user2 = new RegularUser(mediator, "Bob");

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello everyone!");
    }
}
