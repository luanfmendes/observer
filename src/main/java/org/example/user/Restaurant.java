package org.example.user;

import org.example.observer.Observer;

public class Restaurant implements Observer {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " foi notificado: " + message);
    }
}

