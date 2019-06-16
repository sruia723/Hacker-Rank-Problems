import java.util.Scanner;

public class SumOfPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        String des = "y";
        int sum = 0;

        while (des.equals("y") || des.equals("Y")) {
            System.out.println("Enter the number.");
            n = sc.nextInt();
            int temp = 0;
            sum = 0;
            System.out.println("2 is prime");

            for (int j = 3; j <= n; j+=2) {// because even numbers are not prime.

                for (int i = 2; i <= (j/2)+1; i++) {

                    temp = j%i;
                    if (temp == 0) {
                    System.out.println(j + " is not prime");
                    break;
                }
                }
                if (temp != 0) {
                    System.out.println(j + " is prime");
                    sum = sum + j;
                }
            }
            System.out.println("The sum of prime number is: " + (sum+2));//because 2 is also prime
            System.out.println("Do you want to use the app again? Y or N.");
            des = sc.next();
        }
    sc.close();
    }
}

