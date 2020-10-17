package Visitor.Example2;

public class Teacher implements Element {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    private int paperCount;

    public Teacher(String name, int score, int paperCount) {
        this.name = name;
        this.score = score;
        this.paperCount = paperCount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
