package org.example;

public class Main {
    public static void main(String[] args) {
        SimpleCoffee coffee = new SimpleCoffee();
        System.out.println(coffee.cost());
        System.out.println(coffee.description());

        //adding milk
        MilkDecorator milk = new MilkDecorator(coffee);
        System.out.println(milk.description());
        System.out.println("Cost: " + milk.cost());

        // adding sugar
        SugerDecorator suger = new SugerDecorator(coffee);
        System.out.println(suger.description());
        System.out.println("Cost: " + suger.cost());
    }
}