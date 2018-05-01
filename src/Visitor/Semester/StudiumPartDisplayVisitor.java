package Visitor.Semester;

public class StudiumPartDisplayVisitor implements StudiumPartVisitor {
    @Override
    public void visit(Semester semester) {
        System.out.println(semester.name);
    }

    @Override
    public void visit(SAP sap) {
        System.out.println(sap.name);
    }

    @Override
    public void visit(Security security) {
        System.out.println(security.name);
    }

    @Override
    public void visit(OpenConcepts openConcepts) {
        System.out.println(openConcepts.name);
    }

    @Override
    public void visit(RIA ria) {
        System.out.println(ria.name);
    }

    @Override
    public void visit(DesignPattern designPattern) {
        System.out.println(designPattern.name);
    }
}
