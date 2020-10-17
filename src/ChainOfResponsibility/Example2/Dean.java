package ChainOfResponsibility.Example2;

public class Dean extends Leader {
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 10) {
            System.out.println("院长批准你放假"+LeaveDays+"天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没人批假条");
            }
        }
    }
}
