package unit_4.bank_account;

public class TestBankAccount {
    public static void main(String[] args) {
        try {
            System.out.println("Creating account with negative balance...");
            BankAccount acc1 = new BankAccount("Alice", -500);  // ❌ Exception 1
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n--- Creating a valid account ---");
        BankAccount acc2 = new BankAccount("Bob", 1000);

        try {
            System.out.println("\nDepositing negative amount...");
            acc2.deposit(-200);  // ❌ Exception 2
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nWithdrawing more than balance...");
            acc2.withdraw(2000);  // ❌ Exception 3
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n✅ Final Balance: ₹" + acc2.getBalance());
    }
}
