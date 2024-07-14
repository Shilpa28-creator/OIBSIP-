import java.util.Scanner;

public class ATM {
    private double balance;
    private String accountNumber;

    public ATM(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void transactionHistory() {
        System.out.println("Transaction History:");
        // Todo: implement transaction history logic
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void transfer(String recipientAccountNumber, double amount) {
        balance -=amount;
        System.out.println("Transfer successful. New balance:" + balance);
        // Todo: implement transfer logic
    }

    public void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM("1234567890", 1000.0);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    atm.transactionHistory();
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawalAmount = input.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = input.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Enter recipient account number:");
                    String recipientAccountNumber = input.next();
                    System.out.println("Enter transfer amount:");
                    double transferAmount = input.nextDouble();
                    atm.transfer(recipientAccountNumber, transferAmount);
                    break;
                case 5:
                    atm.quit();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
