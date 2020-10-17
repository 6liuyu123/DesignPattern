package ChainOfResponsibility.Example2;

public class ClassAdviser extends Leader {
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 2) {
            System.out.println("班主任批准你放假"+LeaveDays+"天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest((LeaveDays));
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
