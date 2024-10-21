package com.example.ssdp.second;

public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("Statistics updated: Temp=" + temp + ", Humidity=" + humidity + ", Pressure=" + pressure);
    }
}