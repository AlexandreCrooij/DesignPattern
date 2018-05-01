package Visitor.Semester;

public interface StudiumPartVisitor {
        void visit(Semester semester);

        void visit(SAP sap);

        void visit(Security security);

        void visit(OpenConcepts openConcepts);

        void visit(RIA ria);

        void visit(DesignPattern designPattern);
}
