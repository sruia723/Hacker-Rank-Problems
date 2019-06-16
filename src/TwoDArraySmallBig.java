import java.util.Scanner;

public class TwoDArraySmallBig {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the elements of the array.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                a[i][j] = sc.nextInt();
            }
        }

        int big=0, secondbig=0, small=99999999, secondsmall=99999999;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (a[i][j] >= big)
                {
                    big = a[i][j];
                }
                if (a[i][j] <= small)
                {
                    small = a[i][j];
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (a[i][j] == big || a[i][j] == small)
                {
                    continue;
                }
                if (a[i][j] >= secondbig)
                {
                    secondbig = a[i][j];
                }
                if (a[i][j] <= secondsmall)
                {
                    secondsmall = a[i][j];
                }
            }
        }
        System.out.println("Smallest: " + small + "\nBiggest: " + big + "\nSecondsmall: " + secondsmall + "\nSecondbid: "+secondbig);
    }
}
