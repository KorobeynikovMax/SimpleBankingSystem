package banking;

import java.util.Scanner;

public class DoTransfer extends MenuItem {

    public DoTransfer(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the account:");
        String acc = scanner.nextLine();
        String acc15 = acc.substring(0, 15);
        if (Integer.parseInt(acc.substring(15, 16)) != Luhn.getLastDigit(acc15)) {
            System.out.println("Probably you made mistake in card number. Please try again!");
            return 1;
        }
        if (data.getCurrentCard().equals(acc)) {
            System.out.println("You can't transfer money to the same account!");
            return 1;
        }
        if (!SqlClass.numberExist(acc)) {
            System.out.println("Such a card does not exist.");
            return 1;
        }
        System.out.println("How much money do you want to transfer?");
        int money = scanner.nextInt();
        int balance = data.getBalance();
        data.setCurrentBalance(balance - money);
        SqlClass.makeBalanceChange(data.getCurrentCard(), balance - money);
        SqlClass.makeBalanceChange(acc, SqlClass.findCurrentBalance(acc) + money);
        return 1;
    }
}
