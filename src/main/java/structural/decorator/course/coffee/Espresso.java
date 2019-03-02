package structural.decorator.course.coffee;

public class Espresso extends Beverage {
    private static final double ESPRESSO_COST = 1.99d;

    public Espresso() {
        description = "Espresso";
    }

    public double getCost() {
        return ESPRESSO_COST;
    }
}
