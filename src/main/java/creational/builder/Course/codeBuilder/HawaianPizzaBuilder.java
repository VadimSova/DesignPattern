package creational.builder.Course.codeBuilder;

public class HawaianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("SOFT");
    }

    public void buildSouce() {
        pizza.setSouce("MILD");

    }

    public void buildTopping() {
        pizza.setTopping("CHICKEN = PINEAPPLE");

    }
}
