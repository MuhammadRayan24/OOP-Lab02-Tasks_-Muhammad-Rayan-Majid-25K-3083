package Task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double subTotal = 0.0;
        String choice;

        System.out.println("Enter Items:");

        do {
            System.out.println("Enter Item Name:");
            String itemName = sc.nextLine();

            System.out.println("Enter Price:");
            double itemPrice = sc.nextDouble();
            sc.nextLine();

            subTotal += itemPrice;

            System.out.println("Do you want to stop? (y/Y to stop) or press any key to enter!");
            choice = sc.nextLine();

        } while (!(choice.equals("y") || choice.equals("Y")));

        double discountPercent = 10;
        double taxPercent = 5;

        double discountAmount = subTotal * discountPercent / 100;
        double totalAfterDiscount = subTotal - discountAmount;
        double taxAmount = totalAfterDiscount * taxPercent / 100;
        double finalBill = totalAfterDiscount + taxAmount;

        System.out.println("\nINVOICE");
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Discount percent: " + discountPercent + "%");
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Total before tax: $" + totalAfterDiscount);
        System.out.println("Tax percent: " + taxPercent + "%");
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Final Bill: $" + finalBill);


        sc.close();
    }
}
