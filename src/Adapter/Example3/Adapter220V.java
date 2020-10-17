package Adapter.Example3;

//  创建适配器类
class Adapter220V extends PowerPort220V implements Target {
    @Override
    public void Convert_110v() {
        this.Output_220v();
    }
}
