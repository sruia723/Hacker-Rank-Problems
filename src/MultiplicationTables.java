import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        String des = "y";
        while (des.equals("y") || des.equals("Y")) {
            int i = 1;
            System.out.println("Enter the number for multiplication.");
            n = sc.nextInt();
            while (i < 11) {
                System.out.println(i + " x " + n + " = " + (i * n));
                i++;
            }
            System.out.println("Do you want to use the app again? Y or N.");
            des = sc.next();
        }
    sc.close();
    }
}
