package structural.decorator.course;

import structural.decorator.course.coffee.Beverage;
import structural.decorator.course.coffee.Cappucinno;
import structural.decorator.course.coffee.Decaf;
import structural.decorator.course.coffee.Espresso;
import structural.decorator.course.condiment.Caramel;
import structural.decorator.course.condiment.Cream;
import structural.decorator.course.condiment.Milk;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.getCost());

        //apply decorator
        Beverage cappucinno = new Cappucinno();
        cappucinno = new Milk(cappucinno);
        cappucinno = new Caramel(cappucinno);
        cappucinno = new Caramel(cappucinno);
        cappucinno = new Caramel(cappucinno);
        System.out.println(cappucinno.getDescription() + " $" +
                cappucinno.getCost());


        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Cream(decaf);
        decaf = new Cream(decaf);
        System.out.println(decaf.getDescription() + " $" +
                decaf.getCost());

    }

//    Espresso $1.99
//    Cappucinno, Milk, Caramel, Caramel, Caramel $2.21
//    Decaf, Milk, Cream, Cream $1.55
}
