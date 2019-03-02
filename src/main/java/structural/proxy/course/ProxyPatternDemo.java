package structural.proxy.course;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        final String MY_FILE = "MyFile.png";
        Image image = new ProxyImage(MY_FILE);

        image.display();
        System.out.println("FROM CACHE... next");
        image.display();
    }
//    Loading... MyFile.png
//    Display MyFile.png
//    FROM CACHE... next
//    Display MyFile.png
}
