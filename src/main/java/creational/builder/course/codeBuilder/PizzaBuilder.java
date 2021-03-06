package creational.builder.course.codeBuilder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createNewPizza(){
        pizza = new Pizza();
    }
    public Pizza getPizza(){
        return pizza;
    }

    public abstract void buildDough();
    public abstract void buildSouce();
    public abstract void buildTopping();
}
