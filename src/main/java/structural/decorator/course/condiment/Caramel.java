package structural.decorator.course.condiment;

import structural.decorator.course.coffee.Beverage;

public class Caramel extends CondimentDecorator {
    private static final double CARAMEL_COST = 0.15d;
    private Beverage beverage;

    public Caramel(Beverage bv) {
        this.beverage = bv;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    public double getCost() {
        return beverage.getCost() + CARAMEL_COST;
    }
}
