package org.example;

public class ConnemonDecorator extends CoffeeDecorator {

    public ConnemonDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String description() {
        return "Adding Connemon to " + super.description();
    }

}
