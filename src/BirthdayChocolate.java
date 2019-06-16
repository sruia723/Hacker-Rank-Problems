import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int arr[] = new int[num];
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            s.add( sc.nextInt());
        }
        int d = sc.nextInt();
        int m = sc.nextInt();

        int l = s.size();
        int sum = 0, c = 0;
        if(l == 1 && m==1)
        {
            c = 1;
        }
        for(int i = 0 ; i < l-(m-1) ; i++)
        {
            for(int j = i ; j < (i+m) ; j++)
            {
                sum = sum + s.get(j);
            }
            if(sum == d)
            {
                c++;
            }
            sum = 0;
        }

        System.out.println("Answer: " + c);



    }
}
