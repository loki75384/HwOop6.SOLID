package ru.geekbrains.oop.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order(Order orderFromConsole) {
        this.clientName = orderFromConsole.clientName;
        this.product = orderFromConsole.product;
        this.qnt = orderFromConsole.qnt;
        this.price = orderFromConsole.price;
    }


    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }


    }
