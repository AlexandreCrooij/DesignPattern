package Decorator.Ex3;

public class Rectangles implements Shape {

    float length;
    float width;

    public Rectangles(float length, float width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangles "+length+":"+width);
    }
}
