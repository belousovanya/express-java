package homework_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someOwner) {
        this.owner = someOwner;
    }

    String getOwner() {
        return this.owner;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    void printBalance() {
        System.out.println("У владельца счета " + this.owner + " баланс: " + this.balance);
    }
}
