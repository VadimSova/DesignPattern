package creational.Singleton.course;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println(" Singleton was created! ");
    }
}
