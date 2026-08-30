package Bank; // package

import java.util.Scanner; // import

// Class
class BankAccount {
    // Variables, datatypes, identifiers, access modifiers
    private String name; // private
    public long accNo;   // public
    double balance;      // default
    String type;

    // Default Constructor
    BankAccount() {
        name = "Deepthi";
        accNo = 2192889;
        balance = 5000;
        type = "Savings";
    }

    // Parameterized Constructor
    BankAccount(String n, long no, double bal) {
        name = n;
        accNo = no;
        balance = bal;
        type = "Savings";
    }

    // Deposit method
    public void deposit(double amt) {
        if (amt > 0) { // Conditional
            balance = balance + amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    public void withdraw(double amt) {
        if (amt > balance) { // Conditional
            System.out.println("Insufficient Balance");
        } else if (amt <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt);
        }
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Acc No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Object creation

        // Object using Default Constructor
        BankAccount b1 = new BankAccount();
        
        // Object using Parameterized Constructor
        BankAccount b2 = new BankAccount("Beth", 101L, 10000);

        b2.display();

        System.out.print("\nEnter deposit amount: ");
        double dep = sc.nextDouble();
        b2.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        b2.withdraw(wd);

        b2.display();
        sc.close();
    }
}