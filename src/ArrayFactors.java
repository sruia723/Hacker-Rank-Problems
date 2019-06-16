import java.util.Scanner;
import java.util.*;



public class ArrayFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int a[]  = new int[n2];
        int b[] = new int[n1];

        for (int i = 0; i <  n2; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            b[i] = sc.nextInt();
        }

        int n = n1 + n2;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            if (i < n2)
            {
                arr[i] = a[i];
            }
            if (i >= n2)
            {
                arr[i] = b[i-n2];
            }
        }

        //int n1 = b.length;
        //int n2 = a.length;
        /*int t1 = 0 , t2 = 0, c1 = 0, c2 = 0, count = 0;
        for(int j = a[0] ; j <= b[0] ; j++)
        {
            c1 = 0; c2 = 0;
            for(int i = 0 ; i < n1 ; i++)
            {
                t1 = 0; t2 = 0;
                if(i < n2)
                {
                    t1 = a[i]%j;
                    if(t1 == 0)
                    {
                        c1++;
                    }
                }
                t2 = b[i]%j;
                if(t2 == 0)
                {
                    c2++;
                }
                else if(t1 != 0 || t2 != 0)
                {break;}
            }
            if(c1 == n2 && c2 == n1)
            {
                System.out.println(j);
                count++;
            }

        }*/
        //System.out.println(count);
        int t1 =0, c1 = 0, count = 0;
        int fin[] = new int[1000];
        for (int i = 0; i <= n2; i++) {

            for (int j = 0; j < n; j++) {

                if(i<j)
                {
                    t1 = arr[j]%arr[i];
                    if(t1 != 0)
                    {
                        break;
                    }
                    else
                    {
                        c1++;
                    }
                }
            }
            if ((c1 == n-i-1))
            {
                //System.out.println(arr[i]);
                fin[count] = arr[i];
                count++;
                c1 = 0;
            }
        }
        for (int i = a[n2-1]+1; i < b[0]; i++) {
            c1 =0;
            for (int j = 0; j < n; j++) {

                if (j>=n2) {
                    t1 = arr[j] % i;
                    if (t1 != 0) {
                        break;
                    } else {
                        c1++;
                    }
                }
            }
            if ((c1 == n1)) {
                //System.out.println(i);
                fin[count] = i;
                count++;
                c1 = 0;
            }
        }
        //System.out.println(count);
        int countfin = 0;
        for (int i = 0; i < count; i++) {
            int t = 0;
            for (int j = 0; j < n2; j++) {
                if (fin[i]%a[j] == 0)
                {
                    t++;
                }
                else{break;}
            }
            if(t == n2)
            {
                countfin++;
            }
        }
        //System.out.println("The final count is: " + countfin);
        System.out.println(countfin);
    }
}
