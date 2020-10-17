package Visitor.Example2;

public class ResearcherSelection implements Visitor {
    private String awardWords = "[%s]的论文数是%d，荣获科研优秀奖。";

    @Override
    public void visit(Student element) {
        if (element.getPaperCount() >= 2) {
            System.out.println(String.format(awardWords, element.getName(), element.getPaperCount()));
        }
    }

    @Override
    public void visit(Teacher element) {
        if (element.getPaperCount() >= 8) {
            System.out.println(String.format(awardWords, element.getName(), element.getPaperCount()));
        }
    }
}
