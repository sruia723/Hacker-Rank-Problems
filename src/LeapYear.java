import java.util.Scanner;

public class LeapYear {

    public static void checkYear(int year)
    {
        if ( (year%4) == 0)
        {
            System.out.println("Hurray! It's a leap year.");
        }
        else {

            System.out.println("It's not a leap year.");
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int year = 0;
        String des = "Y";

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the year.");
            year = sc.nextInt();
            checkYear(year);
            System.out.println("Do you want to check again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }

        sc.close();
    }
}
