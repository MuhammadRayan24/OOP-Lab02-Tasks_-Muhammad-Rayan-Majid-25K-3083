package Task04;

import java.util.Scanner;

public class Task04 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int n;
        double marks;
        double total=0.0;
        int pass=0;
        int fail=0; 
        double avg;

        System.out.println("Enter The Number Of Students ");
        n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter The Marks Of Student"+i+": ");
            marks= sc.nextDouble();

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
        avg = total / n;

        // Displaying All info
        System.out.println("\n=== Results ===");
        System.out.println("Total Students: " + n);
        System.out.println("Average Marks: " + avg);
        System.out.println("Number of Students Passed: " + pass);
        System.out.println("Number of Students Failed: " + fail);

        sc.close();
    }
}
