package design.pattern.chainOfResponsibility;

public class ResponsibilityTest {
    public static void main(String[] args) {
        Leader techer1=new ClassAdviser();
        Leader teacher2=new DepartmentHead();
        Leader teacher3=new Dean();
        techer1.setNext(teacher2);
        teacher2.setNext(teacher3);
        //Ã·Ωª«Î«Û
        techer1.handleRequest(8);
    }
}
