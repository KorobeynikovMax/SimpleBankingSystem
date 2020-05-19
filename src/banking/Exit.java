package banking;

public class Exit extends MenuItem {

    public Exit(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        System.out.println("Bye!");
        System.exit(0);
        return 0;
    }
}
