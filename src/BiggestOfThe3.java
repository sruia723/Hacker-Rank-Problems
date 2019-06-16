import java.util.Scanner;

public class BiggestOfThe3 {

    public static void checkBig(int a, int b, int c)
    {
        int big = 0;
        big = ( a >= b ) ? ((a >= c) ? a : c) : ((b >= c) ) ? b : c ;// logic of the program.
        System.out.println("Biggest number is: " + big);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        String des = "Y";

        while (des.equals("y") || des.equals("Y")) {

            System.out.println("Enter number 1: ");
            a = sc.nextInt();
            System.out.println("Enter number 2: ");
            b = sc.nextInt();
            System.out.println("Enter number 3: ");
            c = sc.nextInt();
            checkBig(a,b,c);
            System.out.println("Do you want to check again? Press 'y' for yes and 'n' for no");
            des = sc.next();
        }
    sc.close();
    }
}
