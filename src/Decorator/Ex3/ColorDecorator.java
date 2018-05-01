package Decorator.Ex3;

public class ColorDecorator extends Decorator {
    Shape shape;
    String color;
    public ColorDecorator(Shape shape, String color){
        this.shape = shape;
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("Color "+color);
        shape.draw();
    }
}
