package Visitor.Semester;

public class OpenConcepts implements StudiumPart {

    protected String name;
    protected String dozent;
    protected int note;


    public OpenConcepts() {
        name = "Open Concepts";
        dozent = "Alexandre Cotting";
        note = 4;
    }

    @Override
    public void accept(StudiumPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
