import java.util.Scanner;

public class ATM {
    private double balance;
    public static Scanner o = new Scanner(System.in);

    public ATM(double initialamt) {
        this.balance = initialamt;
    }

    public double displayBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Your amount is credited successfully...");
            System.out.println("Do you want to display your current balance in the screen (Y/N)");
            char ch = o.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Your current balance is $" + String.format("%.2f", balance));
            }
        } else {
            System.out.println("Enter valid amount ");
        }
    }

    public void withdraw(double amt) {
        if (amt < balance && amt > 0) {
            balance -= amt;
            System.out.println("Your amount is debited successfully...");
            System.out.println("Do you want to display the balance in the screen (Y/N)");
            char ch = o.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Your current balance is $" + String.format("%.2f", balance));
            }
        } else if (amt > balance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Enter valid amount");
        }
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Tony Bank");
        System.out.println("Enter initial balance");
        double initialamt = o.nextDouble();
        ATM a1 = new ATM(initialamt);
        int choice;
        do {
            System.out.println("1) Check Balance ");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw ");
            System.out.println("4) Exit");
            choice = o.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is $" + a1.displayBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    double depamt = o.nextDouble();
                    a1.deposit(depamt);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw ");
                    double withdrawamt = o.nextDouble();
                    a1.withdraw(withdrawamt);
                    break;
                case 4:
                    System.out.println("Thank you for the services ");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 4);
        o.close();
    }
}
