package com.ahmetov.observer.show;

public class AllWeatherDataShower implements Shower {
    private static AllWeatherDataShower shower = new AllWeatherDataShower();

    private AllWeatherDataShower() {
    }

    public static AllWeatherDataShower getInstance() {
        return shower;
    }

    @Override
    public synchronized void show(int a, int b, int c) {
        System.out.println("temp = " + a);
        System.out.println("pressure = " + b);
        System.out.println("humidity = " + c);
    }
}
