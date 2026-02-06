package Task02;

import java.util.Scanner;

public class Task02 {
    static void main() {
        int evenSum=0;
        int oddSum=0;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Numbers between 1 to 100 or 0 to stop: ");

        while(true) {
            n = sc.nextInt();

            if (n == 0){
                break;
        }
            if(n>=1 && n<=100 ){
                if(n%2==0)
                {
                    evenSum+=n;
                }
                else{
                    oddSum+=n;
                }
            }
        }
        System.out.println("Sum Of Even Numbers: " + evenSum);
        System.out.println("Sum Of Odd Numbers: " + oddSum);

        sc.close();
    }
}
