package com.example.ssdp.third;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();

        TurnTVOn tvOn = new TurnTVOn(tv);

        remote.setCommand(0, tvOn, null);
        remote.onButtonPressed(0);
        remote.undoButtonPressed();
    }
}