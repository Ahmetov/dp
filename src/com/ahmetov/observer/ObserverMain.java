package com.ahmetov.observer;

import com.ahmetov.observer.station.WeatherChecker;
import com.ahmetov.observer.subject.WeatherData;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new WeatherChecker());
    }
}
