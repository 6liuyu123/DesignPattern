package Builder.example2;

public abstract class Builder {
    // build CPU
    public abstract void BuildCPU();

    // build Main board
    public abstract void BuildMainboard();

    // build HD
    public abstract void BuildHD();

    // 返回产品的方法
    public abstract Computer GetComputer();
}
