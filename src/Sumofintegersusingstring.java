import java.util.Scanner;

public class Sumofintegersusingstring {

    public static void calSumOfDigits(String s)
    {
        int l = s.length();
        String temp = "";
        int num[] = new int[l];
        int sum = 0;

        for (int i = 0; i < l; i++) {

            temp = s.substring(i,i+1);
            num[i] = Integer.parseInt(temp);
            sum = sum + num[i];
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = "";
        String des = "y";

        while (des.equals("y") || des.equals("Y")) {

            System.out.println("Enter the number.");
            s = sc.next();
            calSumOfDigits(s);
            System.out.println("Do you want to use app again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }
    sc.close();
    }
}
