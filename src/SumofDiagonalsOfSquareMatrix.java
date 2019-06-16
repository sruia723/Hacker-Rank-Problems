import java.util.Scanner;

public class SumofDiagonalsOfSquareMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of square matix");
        int s = sc.nextInt();

        int a[][] = new int[s][s];
        int sumD1 = 0 , sumD2 = 0;
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {

                a[i][j] = sc.nextInt();
                if (i == j)// principle diagonal
                {
                    sumD1 = sumD1 + a[i][j];
                }
                if ((i+j) == (s-1))
                {
                    sumD2 = sumD2 + a[i][j];
                }
            }
        }
        System.out.println("Principle diagonal: "+ sumD1+ "\nOther diagonal: "+ sumD2);
    }
}
