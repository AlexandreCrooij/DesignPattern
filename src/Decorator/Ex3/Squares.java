package Decorator.Ex3;

public class Squares implements Shape {
    float width;
    public Squares(float width){
        this.width=width;
    }
    @Override
    public void draw() {
        System.out.println("Rectangles "+width);
    }
}
