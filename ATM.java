import java.util.Scanner;

public class ATM {
    private double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient ballance.");
        }
    }

    public void check_balance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exit");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    atm.deposit(amount);
                    break;
                case 2:
                    atm.withdraw(amount);
                    break;
                case 3:
                    atm.check_balance();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
