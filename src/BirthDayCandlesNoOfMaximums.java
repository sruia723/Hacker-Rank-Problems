import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthDayCandlesNoOfMaximums {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int max = ar[0];
        int count = 0 ;
        for(int i = 0 ; i< ar.length ; i++)
        {
            if(ar[i] > max)
            {
                max = ar[i];
            }
        }
        for(int i = 0 ; i< ar.length ; i++)
        {
            if(ar[i] == max)
            {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        for (int i = 0; i < arCount ; i++) {

             ar[i] = scanner.nextInt();
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);

        scanner.close();
    }


}
