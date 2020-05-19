package banking;

import java.util.Scanner;

public class AddIncome extends MenuItem{


    public AddIncome(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to add?");
        int sum = Integer.parseInt(scanner.next());
        sum += SqlClass.findCurrentBalance(data.getCurrentCard());
        SqlClass.makeBalanceChange(data.getCurrentCard(), sum);
        data.setCurrentBalance(sum);
        return 1;
    }
}
