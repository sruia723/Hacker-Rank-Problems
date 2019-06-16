import java.util.Scanner;
// This code is to find the sum of digits using Mathematics.


public class SumOfDigits {

    public static void findSumofDigits(int n)
    {
        int sum = 0, r = 0 , q = 0; //'r' is remainder and 'q' is quotient

        for (int i = 10; i < i*i; i = 10) { // i*i is used so that it is infinite loop

            if (n == 10)
            {
                sum = 1;
                break;
            }
            if (n < 10)
            {
                sum = sum + n;
                break;
            }
            else if (i < n)
            {
                q = n/i;
                r = n%i;
                sum = sum + r;
                n = q;
            }
        }
        System.out.println("The sum of digits is: " + sum);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;

        String des = "Y";

        while (des.equals("y") || des.equals("Y")) {

            System.out.println("Enter the number.");
            n = sc.nextInt();
            findSumofDigits(n);
            System.out.println("Do you want to use the app again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }
    sc.close();
    }
}
