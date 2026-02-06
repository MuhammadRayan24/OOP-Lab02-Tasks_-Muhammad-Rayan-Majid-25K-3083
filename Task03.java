package Task03;

import java.util.Scanner;

public class Task03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter The Integer To Print The Table Upto 10: ");
        n= sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n*i);
        }
        sc.close();
    }
}
