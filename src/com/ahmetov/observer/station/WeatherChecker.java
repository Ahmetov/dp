package com.ahmetov.observer.station;

import com.ahmetov.observer.observer.Observer;
import com.ahmetov.observer.show.AllWeatherDataShower;
import com.ahmetov.observer.show.Shower;
import com.ahmetov.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherChecker implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    private Shower shower = AllWeatherDataShower.getInstance();

    private int randomTemperature;
    private int randomPressure;
    private int randomHumidity;

    public WeatherChecker() {
        //changeIndicators();
    }

    private void changeIndicators() {
//        while (true) {
//            try {
        randomTemperature = randomize(-83, 57);
        randomPressure = randomize(85, 180);
        randomHumidity = randomize(1, 598);
        shower.show(randomTemperature, randomPressure, randomHumidity);
        System.out.println("Indicators changed");
        notifyObservers();
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private int randomize(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
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
            o.update(randomTemperature, randomPressure, randomHumidity);
        }
        System.out.println("Indicators notified observers");
    }
}
