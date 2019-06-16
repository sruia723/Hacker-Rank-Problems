import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        String des = "y";

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the number.");
            n = sc.nextInt();
            int temp = 0;
            /*if(n == 3)
            {
                System.out.println("It is prime");
            }*/
            for (int i = 2; i <= (n/2)+1; i++) {
                if(n == 2)
                {
                    System.out.println("It is prime");
                    break;
                }
                temp = n%i;
                if (temp == 0) {
                    System.out.println("It is not prime");
                    break;
                }
            }
            if (temp != 0)
                System.out.println("It is prime");
            System.out.println("Do you want to use the app again? Y or N.");
            des = sc.next();
        }
    sc.close();
    }
}
