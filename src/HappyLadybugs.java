
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class HappyLadybugs {
    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {

        int len = b.length();
        int countAlpha = 0, countUnder = 0 ;
        int empty[] = new int[len];
        int alpha[] = new int[len];
        char c[] = new char[len];
        for(int i = 0 ; i < len; i++)
        {
            c[i] = b.charAt(i);
            if(!(c[i] >= 'A' && c[i] <= 'Z'))
            {
                empty[countUnder] = i;
                countUnder++;

            }
            else
            {
                alpha[countAlpha] = i;
                countAlpha++;
            }
        }
        for(int i = 0 ; i < len; i++){
            int count = 0;
            if (c[i] == '_'){ continue;}
            for(int j = 0; j < len ;j++)
            {

                if(c[i] == c[j])
                {
                    count++;
                }
            }
            if (count <= 1) {return "NO";}
            else if(countUnder < 1 && count >1)
            {
                if(i == 0 && (c[i] == c[i+1])){ continue;}
                else if ((i > 0 && i < len -1) && (c[i] == c[i+1]|| c[i] == c[i-1])) {continue;}
                else if (i == len -1 && ( c[i] == c[i-1])) {continue;}
                else {return "NO";}
            }
            else if(count > 1 && countUnder >= 1 || countUnder == len){ continue;}
        }
        return "YES";
        //if((len%2) != 0 && len == countAlpha ){ return "NO";}
        //if(countUnder == len){ return "YES";}
        //else{ return "NO";}

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);
            System.out.println(result);
        }

        scanner.close();
    }
}
