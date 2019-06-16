//solution in java
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion{

    /*
     * Complete the timeConversion function below.
     */
    public static void time(String s) {
        /*
         * Write your code here.
         */
        String s1[]=s.split(":");
        String f=s1[2].substring(2);
        String g=s1[2].substring(0,2);
        int t = 0;
// System.out.println(t);
        if( (f.equals("PM")) && ((Integer.parseInt(s1[0]))!=12) ){
            t=Integer.parseInt(s1[0]);
            t=t+12;
            s1[0]=String.valueOf(t);
        }
        if( (f.equals("AM")) && ( (Integer.parseInt(s1[0]))==12)){
// System.out.println(“hello”);
            t=0;
            s1[0]=String.valueOf(t);
        }


// System.out.printf(“%02d:%02d:%02s”,s1[0],s1[1],t);
        System.out.printf("%02d:%02d:%02d",(Integer.parseInt(s1[0])),(Integer.parseInt(s1[1])),(Integer.parseInt(g)));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

//String result = timeConversion(s);
        time(s);

    }
}
