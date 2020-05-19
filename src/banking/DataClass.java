package banking;

public class DataClass {
    private String currentNumber;
    private String currentPin;
    private int currentBalance;

    public String getCurrentCard() {
        return currentNumber;
    }

    public void setCurrentCard(String currentCard, String pin) {
        this.currentNumber = currentCard;
        this.currentPin = pin;
        this.currentBalance = SqlClass.findCurrentBalance(currentCard);
    }

    public int getBalance() {
        return this.currentBalance;
    }

    public void setCurrentBalance(int balance) {
        this.currentBalance = balance;
    }

    public DataClass(String fileName) {
        SqlClass.createNewDatabase(fileName);
        SqlClass.createNewTable();
    }



    public void add(String lValue, String intValue, int balanceValue)  {
        SqlClass.insert(lValue, intValue, balanceValue);
        this.currentNumber = lValue;
        this.currentPin = intValue;
        this.currentBalance = balanceValue;
    }

    public boolean containsCardAndPin(String number, String pin) {
        return SqlClass.contains(number, pin);
    }
}
