package Visitor.Semester;

public class Semester implements StudiumPart {

    protected String name;
    protected StudiumPart[]parts;
    protected int note;


    public Semester(String semester) {
        this.name = semester;
        parts = new StudiumPart[]{new DesignPattern(), new RIA(), new OpenConcepts(), new Security(), new SAP()};
        note = 4;
    }

    @Override
    public void accept(StudiumPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
        for(int i=0; i<parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
    }
}
