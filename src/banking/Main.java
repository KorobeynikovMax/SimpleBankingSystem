package banking;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(0);
        DataClass data = new DataClass(args[1]);
        menu.printMenu(data);
    }
}
