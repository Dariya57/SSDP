package com.example.ssdp.second;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        WeatherDisplay statisticsDisplay = new StatisticsDisplay();

        station.addObserver(currentDisplay);
        station.addObserver(statisticsDisplay);

        station.notifyObservers(25.0, 65, 1013.1);
    }
}