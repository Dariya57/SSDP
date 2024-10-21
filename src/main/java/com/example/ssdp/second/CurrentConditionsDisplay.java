package com.example.ssdp.second;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("Current conditions: Temp=" + temp + ", Humidity=" + humidity + ", Pressure=" + pressure);
    }
}