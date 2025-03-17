class BankAccount {
    // Class attributes
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    // Class attributes
    private double interestRate;

    // Subclass Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        // Calling superclass constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Rate of Interest: " + interestRate + " %");
    }
}

// Subclass
class CheckingAccount extends BankAccount {
    // Class attributes
    private double withdrawalLimit;

    // Subclass Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        // Calling superclass constructor
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayAccountType() {
        super.displayAccountDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: Rs " + withdrawalLimit);
    }
}

// Subclass
class FixedDepositAccount extends BankAccount {
    // Class attributes
    private int tenure;

    // Subclass Constructor
    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    // Method to display account type
    public void displayAccountType() {
        super.displayAccountDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Fixed Deposit Tenure: " + tenure + " months");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("AB-0000-1296", 25000.0, 2.0);
        CheckingAccount checking = new CheckingAccount("AB-0000-1296", 25000.0, 5000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("AB-0000-1296", 25000.0, 18);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixedDeposit.displayAccountType();
    }
}
