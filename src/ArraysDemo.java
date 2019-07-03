import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        int n[] = new int[5];
        System.out.println("Enter the elements of the array.");
        int i = 0;

        while (i < 5) {
            int flag = 0;
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Please enter only integers.");
                flag = 1;
            }

            if (flag == 0)
            {
                n[i] = sc.nextInt();
                i++;
            }
        }

        System.out.println("\nBefore sorting.");
        for (int x: n
             ) {
            System.out.print(x + " ");
        }

        // Use of Arrays class
        Arrays.sort(n);
        System.out.println("\n\nAfter sorting");
        for (int x: n
             ) {
            System.out.print(x + " ");
        }

        System.out.println("\n\nEnter the number to search from the array.");

        while (!sc.hasNextInt())
        {
            sc.next();
            System.out.println("Please enter integer only");
        }
        int sn = sc.nextInt();

        int pos = Arrays.binarySearch(n,sn);

        if (pos >= 0)
            System.out.println("Element found at position = " + pos);
        else
            System.out.println("Not found the element.");

        int[][] m = {{1,2},{3,4}};
        int pos2 = Arrays.binarySearch(m[0],2);
        System.out.println("\n" + pos2);

        System.out.println("Array in matrix form.");
        for (int j = 0; j < 2; j++) {

            for (int k = 0; k < 2; k++) {
                System.out.print(m[j][k] + " ");
            }
            System.out.println();
        }




    }
}
