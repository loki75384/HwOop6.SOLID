package ru.geekbrains.oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        OrderInput orderIn = new OrderInput();
        OrderPersistence orderP = new OrderPersistence();
        Order order = new Order(orderIn.createOrderFromConsole());
        orderP.saveOrderToJson(order);
    }

}
