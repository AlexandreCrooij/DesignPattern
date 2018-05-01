package Decorator.Ex3;

public class TextureDecorator extends Decorator {
    Shape shape;
    String texture;
    public TextureDecorator(Shape shape, String texture){
        this.shape = shape;
        this.texture=texture;
    }
    @Override
    public void draw() {
        System.out.println("Texture "+texture);
        shape.draw();
    }
}
