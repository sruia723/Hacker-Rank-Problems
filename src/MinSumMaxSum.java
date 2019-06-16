import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSumMaxSum {

    static void miniMaxSum(int[] arr) {

        int len = arr.length;
        int min = arr[0];
        int max = arr[0];
        long sumMax = 0;
        long sumMin = 0;
        int count = 0;
        for (int i = 0; i < len ; i++) {


            if(arr[i] >= max)
            {
                max = arr[i];
            }
            if (arr[i] < min ){

                min = arr[i];
            }
            if(max == min){
                count++;
            }


        }

        if(count == len){ sumMax = max * len; sumMin = min * len; System.out.println(sumMin + " " + sumMax );}
        else{
            for (int i = 0; i < len ; i++) {

                if(arr[i] != min)
                {
                    sumMax = sumMax + arr[i];
                }
                if(arr[i] != max){

                    sumMin = sumMin + arr[i];
                }
            }
            System.out.println(sumMin + " " + sumMax );
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 5 ; i++) {

            arr[i] = scanner.nextInt();
        }

        miniMaxSum(arr);

        scanner.close();
    }


}
