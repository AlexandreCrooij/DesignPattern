package Decorator.Ex3;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circles(20);
        shape = new BorderDecorator(shape, "dotted");
        shape = new ColorDecorator(shape, "blue");
        shape = new TextureDecorator(shape, "sliced");
        shape.draw();
    }
}
