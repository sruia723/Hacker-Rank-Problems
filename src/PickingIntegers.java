import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PickingIntegers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int countIni = 0;
        for (int i = 0; i < a.size(); i++) {

            int temp = a.get(i);
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < a.size(); j++) {

                if (((a.get(i) - a.get(j))== 1) ||  (a.get(i)==a.get(j))) {
                    count1++;
                }
                if (((a.get(j) - a.get(i))== 1) || (a.get(i)==a.get(j))) {
                    count2++;
                }
            }
            if (countIni<= count1 && count1>count2)
            {
                countIni = count1;
            }
            if (countIni<= count2 && count2>count1)
            {
                countIni = count2;
            }
            if (count2 == count1) {
                countIni = count1;
            }
        }

        return countIni;
    }

     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = sc.nextInt();
            a.add(aItem);
        }

        int result = PickingIntegers.pickingNumbers(a);

        System.out.println(result);
    }


}
