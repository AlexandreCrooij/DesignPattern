package Visitor.Semester;

public class DesignPattern implements StudiumPart {

    protected String name;
    protected String dozent;
    protected int note;

    public DesignPattern() {
        name = "Design Pattern";
        dozent = "Michael Schumacher";
        note = 4;
    }

    @Override
    public void accept(StudiumPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
