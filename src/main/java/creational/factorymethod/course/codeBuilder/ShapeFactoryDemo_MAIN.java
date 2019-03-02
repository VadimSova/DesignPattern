package creational.factorymethod.course.codeBuilder;

public class ShapeFactoryDemo_MAIN {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = null;
        shape = shapeFactory.createShape("Square");
        assert shape != null;
        shape.draw();
        shape = shapeFactory.createShape("Rectangle");
        shape.draw();
        shape = shapeFactory.createShape("Circle");
        shape.draw();

    }

}
