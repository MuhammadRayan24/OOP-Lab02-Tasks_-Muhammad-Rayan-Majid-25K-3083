package Task04;

import java.util.Scanner;

public class Task04 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int n;
        int marks;
        int total=0;
        int pass=0;
        int fail=0;
        double avg=0;

        System.out.println("Enter The Number Of Students ");
        n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter The Marks Of Student"+i+": ");
            marks= sc.nextInt();

            total += marks;

            if(marks>=60)
            {
                pass++;
            }
            else
            {
                fail++;
            }
        }
        avg = (double) total / n;

        // Displaying All info
        System.out.println("\n=== Results ===");
        System.out.println("Total Students: " + n);
        System.out.println("Average Marks: " + avg);
        System.out.println("Number of Students Passed: " + pass);
        System.out.println("Number of Students Failed: " + fail);

        sc.close();
    }
}
