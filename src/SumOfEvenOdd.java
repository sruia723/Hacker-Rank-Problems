import java.util.Scanner;

public class SumOfEvenOdd {

    public static void calSum(int range)
    {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= range ; i++) {

            if (i%2 == 0) {

                evenSum = evenSum + i;
            }
            if (i%2 != 0) {

                oddSum = oddSum + i;
            }
        }
        System.out.println("The sum of odd numbers is: "+ oddSum + "\nThe sum of even number is: " + evenSum);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        sc.useDelimiter("\\n");
        int range = 0;
        String des = "y";

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the range of the number till you want to find sum of even and odd.");
            range = sc.nextInt();
            calSum(range);
            System.out.println("Do you want to use the app again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }
    sc.close();
    }

}
