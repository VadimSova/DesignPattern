package structural.decorator.course.condiment;

import structural.decorator.course.coffee.Beverage;

public class Milk extends CondimentDecorator {
    private static final double MILK_COST = 0.10d;
    private Beverage beverage;

    public Milk(Beverage bv) {
        this.beverage = bv;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double getCost() {
        return beverage.getCost() + MILK_COST;

    }
}

