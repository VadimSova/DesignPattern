package behavioural.chainofresponsability.iterator;

public class NameRepository implements Container {
    public String names[] = {"John", "Dan", "Bob"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {
        private int index;

        public boolean hasNext() {
            if ((index < names.length) && (index >= 0)) {
                return true;
            }
            return false;

        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }
}
