package structural.decorator.course.condiment;

import structural.decorator.course.coffee.Beverage;

public class Cream extends CondimentDecorator {
    private static final double CREAM_COST = 0.20d;
    private Beverage beverage;

    public Cream(Beverage bv) {
        this.beverage = bv;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    public double getCost() {
        return beverage.getCost() + CREAM_COST;

    }
}
