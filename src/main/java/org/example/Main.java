package org.example;

import org.example.system.DeliverySystem;
import org.example.user.Customer;

public class Main {
    public static void main(String[] args) {
        DeliverySystem deliverySystem = new DeliverySystem();

        Customer customer1 = new Customer("João");
        Customer customer2 = new Customer("Maria");

        deliverySystem.addObserver(customer1);
        deliverySystem.addObserver(customer2);

        System.out.println("Atualizando status do pedido...");
        deliverySystem.updateOrderStatus("Pedido Recebido");
        deliverySystem.updateOrderStatus("Pedido em Preparação");
        deliverySystem.updateOrderStatus("Saiu para Entrega");
        deliverySystem.updateOrderStatus("Pedido Entregue");
    }
}