package creational.builder.course.codeBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("TOUGH");
    }

    public void buildSouce() {
        pizza.setSouce("HOT");

    }

    public void buildTopping() {
        pizza.setTopping("SALAMI = PEPPERONI");

    }
}
