import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size os the square matrix");
        int s = sc.nextInt();

        int a[][] = new int[s][s];
        System.out.println("Enter the elements");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {

                if (j > i)
                {
                    int temp = a[j][i];
                    a[j][i] = a[i][j];
                    a[i][j] = temp;
                }
            }
        }

        for (int i = 0; i < s; i++) {
            System.out.println();
            for (int j = 0; j < s; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
