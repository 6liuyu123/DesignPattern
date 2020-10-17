package Builder.example2;

public class ConcreteBuilder extends Builder {
    Computer computer = new Computer();

    @Override
    public void BuildCPU() {
        computer.Add("build cpu");
    }

    @Override
    public void BuildMainboard() {
        computer.Add("build mainboard");
    }

    @Override
    public void BuildHD() {
        computer.Add("build hd");
    }

    @Override
    public Computer GetComputer() {
        return computer;
    }
}
