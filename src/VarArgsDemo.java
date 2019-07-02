import java.util.Scanner;

public class VarArgsDemo {

    public static int sum (int... n) // n is variable arguments
    {
        int sum = 0;

        for (int x : n) {
            sum = sum + x;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the number of elements you want to find the sum.\nEnter 3 or 5");

        while (!sc.hasNextInt())
        {
            sc.next();
            System.out.println("Please enter the integer input.");
        }
        int num = sc.nextInt();

        System.out.println("Please enter the numbers.");

        int a=0,b=0,c=0,d=0,e=0;
        if (num == 3)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        else
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
        }

        int sum = 0;

        if (num == 3)
        {
            sum = sum(a,b,c);
        }
        else
        {
            sum = sum(a,b,c,d,e);
        }

        System.out.println("Sum of all the elements is = " + sum);

    }
}
