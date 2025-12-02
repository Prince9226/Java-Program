//   2.	Write a program using interface BankAccount with methods deposit(), withdraw(), and getBalance().


// Interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Implementing class
class SimpleBankAccount implements BankAccount {
    private double balance;

    SimpleBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }


    public double getBalance() {
        return balance;
    }
}

// Main class to test
public class secondtt {
    public static void main(String[] args) {
        BankAccount account = new SimpleBankAccount(1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500); // should show error

        System.out.println("Current Balance: " + account.getBalance());
    }
}
