package creational.Singleton.Course;

public class SingletonPatternDemo_MAIN {
    public static void main(String[] args) {
        // Singleton object = new Singleton();
        Singleton object = Singleton.getInstance();
        object.showMessage();

    }
}
