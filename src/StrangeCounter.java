import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrangeCounter {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {

        //Map<Long,Long> miramaar = new HashMap<>();
        /*long a = t;
        long Bini = 3;
        long b = 3;
        for (long i = 1; i <= a; i++) {

            if ( b < 1 )
            {
                Bini = Bini * 2;
                b = Bini;
            }
            System.out.println(i + " " + b);
            b--;
        }*/
        long result=0;
        if(t<4){
            result=4-t;
        }
        else{
            long num = 4;
            for (long j = 0; j < t; j++) {
                 num = (long) (num + 6 * (Math.pow(2,j)));
                 if( num > t)
                 {
                     result = num - t;
                     break;

                 }
            }


        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        System.out.println("Result is = " + result);

        scanner.close();
    }
}
