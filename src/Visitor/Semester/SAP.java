package Visitor.Semester;

public class SAP implements StudiumPart {

    protected String name;
    protected String dozent;
    protected int note;

    public SAP() {
        name = "SAP";
        dozent = "Werner Maier";
        note = 5;
    }

    @Override
    public void accept(StudiumPartVisitor studiumPartVisitor) {
        studiumPartVisitor.visit(this);
    }
}
