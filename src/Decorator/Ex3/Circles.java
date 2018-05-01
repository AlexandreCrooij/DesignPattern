package Decorator.Ex3;

public class Circles implements Shape {

    float diameter;

    public Circles(float diameter){
        this.diameter=diameter;
    }

    @Override
    public void draw() {
        System.out.println("Rectangles "+diameter);
    }
}
