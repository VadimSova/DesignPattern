package structural.decorator.course.coffee;

public class Decaf extends Beverage {
    private static final double DECAF_COST = 1.05d;

    public Decaf() {
        description = "Decaf";
    }

    public double getCost() {
        return DECAF_COST;
    }
}
