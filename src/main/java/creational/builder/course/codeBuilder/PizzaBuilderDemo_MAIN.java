package creational.builder.course.codeBuilder;

public class PizzaBuilderDemo_MAIN {
    public static void main(String[] args) {
        // waiter construct table
        Waiter waiter = new Waiter();
        //waiter takes order
        PizzaBuilder hawaian = new HawaianPizzaBuilder();
        //PizzaBuilder spicy = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaian);
        //waiter.setPizzaBuilder(spicy);
        // waiter makes builder
        waiter.constructPizza();
        //deliver pizza
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
