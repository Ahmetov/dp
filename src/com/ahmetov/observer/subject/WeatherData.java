package com.ahmetov.observer.subject;

import com.ahmetov.observer.observer.Observer;
import com.ahmetov.observer.show.AllWeatherDataShower;
import com.ahmetov.observer.show.Shower;

import java.util.ArrayList;
import java.util.List;

//TODO multithreading problem
public class WeatherData implements Subject, Observer {
    private Shower shower = AllWeatherDataShower.getInstance();

    private List<Observer> observerList = new ArrayList<>();

    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherData(Subject subject) {
        subject.addObserver(this);
    }

    public int getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    //method always calls when data has changed
    private void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(temperature, pressure, humidity);
        }
        System.out.println("WeatherData notified observers");
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        System.out.println("[Weather data] Indicators data received");
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        shower.show(temperature, pressure, humidity);
        measurementsChanged();
    }
}
