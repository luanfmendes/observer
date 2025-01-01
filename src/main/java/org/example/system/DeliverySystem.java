package org.example.system;

import org.example.observer.Observer;
import org.example.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class DeliverySystem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void updateDeliveryStatus(String status) {
        System.out.println("Atualizando status da entrega: " + status);
        notifyObservers(status);
    }

    public void updateOrderStatus(String status) {
        this.orderStatus = status;
        notifyObservers("O status do pedido foi atualizado para: " + status);
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
