package Adapter.Example3;

public class AdapterPattern {
    public static void main(String[] args) {
        Target mAdapter220V = new Adapter220V();
        ImportedMachine mImportedMachine = new ImportedMachine();

        mAdapter220V.Convert_110v();
        mImportedMachine.Work();
    }
}
