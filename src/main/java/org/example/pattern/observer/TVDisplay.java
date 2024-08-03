package org.example.pattern.observer;

public class TVDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("Updated weather in TV display: " + this.weather);
    }
}
