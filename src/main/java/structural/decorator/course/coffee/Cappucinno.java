package structural.decorator.course.coffee;

public class Cappucinno extends Beverage {
    private static final double CAPPUCINNO_COST = 1.66d;

    public Cappucinno() {
        description = "Cappucinno";
    }

    public double getCost() {
        return CAPPUCINNO_COST;
    }
}
