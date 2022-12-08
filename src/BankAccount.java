public class BankAccount {
    private String name;
    private String cardNumber;
    private String balance;

    public BankAccount(String name, String cardNumber, String balance) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
