import java.util.Scanner;

public class MajorMinor {

    public static void checkAge(int age)
    {
        if ( age >= 18)
        {
            System.out.println("The person is an adult.");
        }
        else {

            System.out.println("The person is a minor.");
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int age = 0;
        String des = "Y";

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the age of the person.");
            age = sc.nextInt();
            checkAge(age);
            System.out.println("Do you want to check again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }

    sc.close();
    }

}
