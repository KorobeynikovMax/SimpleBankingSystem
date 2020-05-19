package banking;

public abstract class MenuItem {
    private String name;
    private int number;

    public MenuItem(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public abstract int workingProcess(DataClass data);
}
