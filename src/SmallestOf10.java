import java.util.Scanner;
//I used a different logic to get the complexity of program to O(n/2) form O(n).
// Please let me know if there's a better way to reduce complexity. Thanks
public class SmallestOf10 {

    public static void findSmall(int range, int num[])
    {
        int small1 = num[1], small2 = num[range], mid = range/2;

        if(range%2 != 0)
        {
            mid += 1;
        }

        for (int i = 1; i <= mid; i++) {

            if (num[i] < small1)
            {
                small1 = num[i];
            }
            if (num[range -i] < small2)
            {
                if (range-i == mid)
                {
                    continue;
                }
                small2 = num[range -i];
            }
        }
        if (small1 < small2)
        {
            System.out.println("Smallest number is: "  + small1);
        }
        else
        {
            System.out.println("Smallest number is: " + small2);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int range = 0;


        String des = "y";
        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter how many numbers you want to check.");
            range = sc.nextInt();
            int num[] = new int[range+1];
            for (int i = 1; i <= range; i++) {

                System.out.println("Enter the number " + i);
                num[i] = sc.nextInt();
            }
            findSmall(range,num);
            System.out.println("Do you want to use the app again? Press 'y' for yes and 'n' for no.");
            des = sc.next();
        }
    sc.close();
    }
}
