package creational.factorymethod.Course.codeBuilder;

public class ShapeFactory {
    public Shape createShape(String type){
        Shape shape = null;
        if (type.equals("Circle")){
            shape = new Circle();
        }

        if (type.equals("Square")){
            shape = new Square();
        }
        if (type.equals("Rectangle")){
            shape = new Rectangle();
        }
        return shape;
    }
}
