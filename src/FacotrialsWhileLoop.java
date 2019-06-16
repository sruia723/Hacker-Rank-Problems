import java.util.Scanner;

public class FacotrialsWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String des = "y";
        int n = 0;

        while (des.equals("y") || des.equals("Y")) {

            System.out.println("Enter the number till which you want factorial.");
            n = sc.nextInt();
            int i = 1;long sum = 1;
            System.out.println("Number          Factorial");
            while (i <= n)
            {
                sum = sum * i ;
                System.out.println(i + "               " + sum);
                i++;
            }
            System.out.println("Do you want to use the app again? Y or N.");
            des = sc.next();
        }
    sc.close();
    }
}
