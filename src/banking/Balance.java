package banking;

public class Balance extends MenuItem {

    public Balance(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        System.out.println("Balance: " + data.getBalance());
        System.out.println();
        return 1;
    }
}
