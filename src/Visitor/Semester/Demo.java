package Visitor.Semester;

public class Demo{
    public static void main(String[] args) {
        Semester semester = new Semester("Semester 4");


        System.out.println("DisplayVisitor\n-----------------------------------------------");
        semester.accept(new StudiumPartDisplayVisitor());

        System.out.println("DozentenVisitor\n-----------------------------------------------");
        semester.accept(new StudiumPartDozentenVisitor());

        System.out.println("GeneralInformationVisitor\n-----------------------------------------------");
        semester.accept(new StudiumPartGeneralInformationVisitor());
        /*
        */
    }
}
