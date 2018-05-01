package Visitor.Semester;

public class StudiumPartGeneralInformationVisitor implements StudiumPartVisitor {
    @Override
    public void visit(Semester semester) {
        System.out.println(semester.name+"\n"+semester.note);
    }

    @Override
    public void visit(SAP sap) {
        System.out.println(sap.name+"\n"+sap.note+"\n"+sap.dozent);
    }

    @Override
    public void visit(Security security) {
        System.out.println(security.name+"\n"+security.note+"\n"+security.dozent);
    }

    @Override
    public void visit(OpenConcepts openConcepts) {
        System.out.println(openConcepts.name+"\n"+openConcepts.note+"\n"+openConcepts.dozent);
    }

    @Override
    public void visit(RIA ria) {
        System.out.println(ria.name+"\n"+ria.note+"\n"+ria.dozent);
    }

    @Override
    public void visit(DesignPattern designPattern) {
        System.out.println(designPattern.name+"\n"+designPattern.note+"\n"+designPattern.dozent);
    }
}
