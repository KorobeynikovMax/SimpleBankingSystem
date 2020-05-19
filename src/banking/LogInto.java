package banking;

import java.util.Scanner;

public class LogInto extends MenuItem {

    public LogInto(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        System.out.println("Enter your card number:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Enter your PIN:");
        String i = scanner.nextLine();
        System.out.println();
        if (data.containsCardAndPin(string, i)) {
            System.out.println("You have successfully logged in!");
            System.out.println();
            Menu subMenu = new Menu(1);
            data.setCurrentCard(string, i);
            subMenu.printMenu(data);
            return 1;
        } else {
            System.out.println("Wrong card number or PIN!\n");
            return 1;
        }
    }
}
