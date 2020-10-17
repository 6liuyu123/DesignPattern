package ChainOfResponsibility.Example2;

public class LeaveApprovalTest {
    public static void main(String[] args) {
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();

        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher1.handleRequest(8);
    }
}
