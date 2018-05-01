package Visitor.Semester;

public class Security implements StudiumPart {

    protected String name;
    protected String dozent;
    protected int note;

    public Security() {
        name = "Security";
        dozent = "Xavier Barmaz";
        note = 4;
    }

    @Override
    public void accept(StudiumPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
