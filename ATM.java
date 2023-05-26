import java.util.*;

public class ATM {

    int pinn;

    public static void main(String[] args) {
        int pin;
        int balance = 0;
        ATM obj = new ATM();
        obj.pinn = 1232;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin:");
        pin = sc.nextInt();
        while (true) {
            if (obj.pinn == pin) {

                System.out.println("Enter your choice:");

                System.out.println("1.Balance enquiry");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // System.out.println("Enter amount:");
                        // int amount = sc.nextInt();
                        System.out.println("Enter pin");
                        int pin2 = sc.nextInt();
                        if (pin == pin2) {
                            System.out.println("Your balance is " + balance);
                        } else {
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 2:
                        System.out.println("Enter amount:");
                        int amount2 = sc.nextInt();
                        System.out.println("Enter pin");
                        int pin3 = sc.nextInt();
                        if (pin == pin3) {
                            balance += amount2;
                        } else {
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount:");
                        int amount3 = sc.nextInt();
                        System.out.println("Enter pin: ");
                        int pin4 = sc.nextInt();
                        if (pin == pin4) {
                            balance = balance - amount3;
                        } else {
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 4:
                        return;

                    default:
                        System.out.println("Enter valid choice");
                        break;

                }

            } else {
                System.out.println("Enter a valid pin number");
            }

        }
    }
}
