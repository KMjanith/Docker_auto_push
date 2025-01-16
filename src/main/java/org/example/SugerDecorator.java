package org.example;

public class SugerDecorator extends CoffeeDecorator{

    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

    @Override
    public String description() {
        return "Added sugar to the: " + super.description();
    }
}
