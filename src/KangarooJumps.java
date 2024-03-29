import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class KangarooJumps {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        int a = 0, b = 0 , i = 1, count = 0;
        if((x2>x1 && v2 > v1) || (x1>x2 && v1>v2))
        {
            return "NO";
        }
        else{
            do {
                a = x1 + v1 * i;
                b = x2 + v2 * i;
                count++;
                if (a == b) {
                    System.out.print(count+  " " + a +" " +b);
                    return "YES";
                }
                i++;
                if(i>10000)  { return "NO";}

            } while (a != b);
        }
        System.out.print(count+ " ");
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        scanner.close();
    }
}
