package com.example.ssdp.second;
import java.util.*;

public class WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();

    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double temp, double humidity, double pressure) {
        for (WeatherDisplay observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }
}