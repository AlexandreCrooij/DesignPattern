package Visitor.Semester;

public class RIA implements StudiumPart {

    protected String name;
    protected String dozent;
    protected int note;

    public RIA() {
        name = "RIA";
        dozent = "Rene Schumann";
        note = 5;
    }

    @Override
    public void accept(StudiumPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
