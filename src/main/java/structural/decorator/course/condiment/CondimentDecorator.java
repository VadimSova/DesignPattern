package structural.decorator.course.condiment;

import structural.decorator.course.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
