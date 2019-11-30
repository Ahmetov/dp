package com.ahmetov.observer.subject;

import com.ahmetov.observer.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
