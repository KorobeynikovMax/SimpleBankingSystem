package banking;

public class CloseAcc extends MenuItem {

    public CloseAcc(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        SqlClass.deleteRow(data.getCurrentCard());
        System.out.println("Your account was successfully deleted!");
        System.out.println();
        return 0;
    }
}
