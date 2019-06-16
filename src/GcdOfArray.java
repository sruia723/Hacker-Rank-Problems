import java.util.Scanner;

public class GcdOfArray {

    public static int gcd(int n, int m)
    {

        int gcd = 0 , rem = 0, temp = 0;
        if (n > m)
        {
            temp = m;
        }
        else
        {
            temp = n;
            n = m;
        }

        do
        {
            rem = n%temp;
            if(rem != 0 )
            {
                n = temp;
                temp = rem;
            }
            /*if (rem == 0)
            {
                break;
            }*/
            if (rem == 1 )
            {
                temp = rem;
                break;
            }

        }while(rem != 0);

        gcd = temp;
        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l = sc.nextInt();
        System.out.println("Enter the array.");
        int arr[] = new int[l];

        for (int i = 0; i < l; i++) {

            arr[i] = sc.nextInt();
        }

        int g = 0;

        for (int i = 0; i < l; i++) {

            if (i == 1)
            {
                g = gcd(arr[i],arr[i-1]);
            }
            if (g == 1)
            {
                break;
            }
            if (i > 1) {
                g = gcd(g, arr[i]);
            }
        }

        System.out.println("\nGCD of the numbers is: " + g);


    }
}
