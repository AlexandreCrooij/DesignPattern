package Visitor.Semester;

public class StudiumPartDozentenVisitor implements StudiumPartVisitor {
    @Override
    public void visit(Semester semester) {
        System.out.println(semester.name);
    }

    @Override
    public void visit(SAP sap) {
        System.out.println(sap.dozent);
    }

    @Override
    public void visit(Security security) {
        System.out.println(security.dozent);
    }

    @Override
    public void visit(OpenConcepts openConcepts) {
        System.out.println(openConcepts.dozent);
    }

    @Override
    public void visit(RIA ria) {
        System.out.println(ria.dozent);
    }

    @Override
    public void visit(DesignPattern designPattern) {
        System.out.println(designPattern.dozent);
    }
}
