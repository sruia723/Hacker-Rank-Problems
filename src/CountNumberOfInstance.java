// To calculate the number of instances of a class.
// LOGIC
// Every time an object is created, the constructor is called. So we declare static int count in the class and increment it in the constructor.

import java.util.Scanner;

class CountInstances
{
    static int count;// static so that value doesn't change with new object

    CountInstances()// its the constructor
    {
        count = count + 1;
        System.out.println("Object number " + count + " created");
    }
}
public class CountNumberOfInstance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of objects you want to create.");
        int n = sc.nextInt();

        CountInstances c[] = new CountInstances[n];

        for (int i = 0; i < n; i++) {

            c[i] = new CountInstances();
        }

        if (c[0].count == n)
        {
            System.out.println("\nTotal number of objects created " + c[0].count);
            System.out.println("You wanted to create "+ n + " objects.\nYou successfully created "+c[0].count+" objects");
        }
    sc.close();
    }
}
