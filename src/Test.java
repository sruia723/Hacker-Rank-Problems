import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int moves = s.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            myList.add(num);
        }
        int result = myMethod(myList,moves);
        System.out.println(result);
    }

    private static int myMethod(List<Integer> myList, int moves) {
        //myList.sort(Collections.reverseOrder());
        Collections.sort(myList,Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {

            double currentNum = myList.get(i);

            while (moves >0)
            {

                if((i+1) < myList.size()) {
                    if(currentNum >= myList.get(i+1)){
                        currentNum = Math.ceil(currentNum/2);
                        sum = sum +(int)currentNum;
                        myList.set(i, (int) currentNum);
                        moves--;
                    } else { break;}
                }

            }

            if(moves<=0){ break;}

        }
        int listSum = 0;
        for (int i: myList) {
            listSum += i;
        }
        //System.out.println(sum+" sum"+"======="+listSum);
        int result = listSum - sum;

        return result;
    }


}

