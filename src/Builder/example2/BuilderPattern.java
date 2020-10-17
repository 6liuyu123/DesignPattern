package Builder.example2;

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.GetComputer();
        computer.Show();
    }
}
