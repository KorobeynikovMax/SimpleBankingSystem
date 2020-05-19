package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int countOfItems;
    private ArrayList<MenuItem> arrayItems;
    private Boolean isExit;

    public Menu(int subMenu) {
        this.countOfItems = 0;
        this.arrayItems = new ArrayList<MenuItem>();
        this.isExit = false;
        if (subMenu == 1) {
            arrayItems.add(new Balance("Balance", 1));
            arrayItems.add(new AddIncome("Add income", 2));
            arrayItems.add(new DoTransfer("Do transfer", 3));
            arrayItems.add(new CloseAcc("Close account", 4));
            arrayItems.add(new LogOut("Log out", 5));
            arrayItems.add(new Exit("Exit", 0));
            return;
        }
        arrayItems.add(new CreateAccount("Create account", 1));
        arrayItems.add(new LogInto("Log into account", 2));
        arrayItems.add(new Exit("Exit", 0));
    }

    public void printMenu(DataClass data) {
        while (!isExit) {
            for (MenuItem menuItem : this.arrayItems) {
                System.out.println(menuItem.getNumber() + ". " + menuItem.getName());
            }
            if (this.listen(data) == 0) {
                isExit = true;
            }
        }
    }

    public int listen(DataClass data) {
        Scanner scanner = new Scanner(System.in);
        int returnValue = 0;
        int choise = scanner.nextInt();
        System.out.println();
        for (MenuItem menuItem : this.arrayItems) {
            if (menuItem.getNumber() == choise) {
                returnValue = menuItem.workingProcess(data);
            }
        }
        if (returnValue == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
