package banco;

/**
 *
 * @author grazi
 */
public class Account {

    private Integer number;
    private String holder;
    private double balance; // saldo

    public Account(Integer number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;

    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() { // saldo
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;

    }

    public void withdraw(double amount) { //sacar
        balance = balance - (amount + 5.0);
    }

    public String toString() {
        return ("Account ") + number
                + (", Holder: ") + holder
                + (", Balance: $ ") + balance;

    }

}

