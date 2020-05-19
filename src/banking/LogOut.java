package banking;

public class LogOut extends MenuItem {

    public LogOut(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        System.out.println("You have successfully logged out!\n");
        return 0;
    }
}
