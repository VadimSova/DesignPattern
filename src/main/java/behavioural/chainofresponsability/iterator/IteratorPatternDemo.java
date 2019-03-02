package behavioural.chainofresponsability.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository names = new NameRepository();

        Iterator it = names.getIterator();

        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.println(name);
        }

    }
}
