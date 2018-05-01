package Decorator.Ex3;

public class BorderDecorator extends Decorator {
    Shape shape;
    String border;
    public BorderDecorator(Shape shape, String border){
        this.shape = shape;
        this.border=border;
    }
    @Override
    public void draw() {
        System.out.println("Border "+border);
        shape.draw();
    }
}
