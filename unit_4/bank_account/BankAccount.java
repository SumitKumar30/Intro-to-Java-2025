package unit_4.bank_account;

public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("❌ Cannot create account with negative balance.");
        }
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("❌ Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("✅ Deposited: ₹" + amount + ", New Balance: ₹" + balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException("❌ Withdrawal amount must be between ₹0 and ₹" + balance);
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: ₹" + amount + ", Remaining Balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
