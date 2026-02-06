package Task05;

import java.util.Scanner;

public class Task05 {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pre-stored credentials
        String username = "RAYAN MAJID";
        String password = "25K-3083";

        // taking input from the User
        String inputUser;
        String inputPass;

        System.out.println("Enter The Username: ");
        inputUser = sc.nextLine();

        System.out.println("Enter The Password: ");
        inputPass = sc.nextLine();

        // Checking login credentials from pre-stored credentials

        if (username.equals(inputUser) && password.equals(inputPass))
        {

            System.out.println("** Welcome To Bank Of Pakistan **");

            double balance=0;   // setting or assuming the initial balance
            char choice;

            do
            {
                System.out.println("\nMain Menu");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Account Status");

                System.out.println("Enter Your Choice: ");
                int option = sc.nextInt();

                if (option == 1)
                {
                    System.out.println("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance = balance + amount;
                    System.out.println("Amount deposited successfully.");

                }
                else if (option == 2)
                {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance)
                    {
                        balance = balance - amount;
                        System.out.println("Please collect your cash.");
                    }
                    else
                    {
                        System.out.println("Insufficient balance.");
                    }

                }
                else if (option == 3)
                {
                    System.out.println("Account Owner: " + username);
                    System.out.println("Current Balance: " + balance);
                } else
                {
                    System.out.println("Invalid choice.");
                }

                System.out.println("\nDo you want to continue? (y/Y): ");
                choice = sc.next().charAt(0);

            }
            while (choice == 'y' || choice == 'Y');

            System.out.println("Thank you!");

        }
        else
        {
            System.out.println("Invalid username or password.");
        }

        sc.close();
    }
}
