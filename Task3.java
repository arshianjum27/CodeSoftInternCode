                                             //Task3
                                       //ATM Interface
package ArshiAnjum;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance:: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance:: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayOptions() {
        System.out.println("\nHere are the options:-");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit\n");
    }

    public void performTransaction(Scanner scanner) {
        while (true) {
            displayOptions();
            System.out.print("Select an option:: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance:: " + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount:: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount:: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!!");
                    return;
                default:
                    System.out.println("Sorry!! Invalid choice.");
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(account);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!!");

        atm.performTransaction(scanner);

        scanner.close();
    }
}
