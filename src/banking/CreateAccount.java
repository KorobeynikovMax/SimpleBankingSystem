package banking;

import java.util.Random;

public class CreateAccount extends MenuItem{

    public CreateAccount(String name, int number) {
        super(name, number);
    }

    @Override
    public int workingProcess(DataClass data) {
        Random random = new Random();
        String s = "400000";
        for (int i = 0; i < 9; i++) {
            s = s + random.nextInt(10);
        }
        s = s + Luhn.getLastDigit(s);
        System.out.println("Your card have been created");
        System.out.println("Your card number:");
        System.out.println(s);
        int a = 0;
        int b = 9_999;
        int x = random.nextInt(b - a + 1) + a;
        String pin = "";
        for (int i = 0; i < 4; i++) {
            int y = x / ((int) Math.pow(10, i)) % 10;
            pin += String.valueOf(y);
        }
        System.out.println("Your card PIN:");
        System.out.println(pin);
        System.out.println();
        data.add(s, pin, 0);
        return 1;
    }

}
