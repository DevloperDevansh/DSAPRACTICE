// Abstract class BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Abstract method for deposit
    public abstract void deposit(double amount);

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Current Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Current Account");
        } else {
            System.out.println("Insufficient funds in Current Account");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create a SavingsAccount and a CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(2000.0, 500.0);

        // Perform operations on the accounts
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.displayBalance();

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(3000.0);
        currentAccount.displayBalance();
    }
}
