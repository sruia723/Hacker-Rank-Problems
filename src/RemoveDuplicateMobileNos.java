import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateMobileNos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        LinkedList<Integer> mobileNos = new LinkedList<Integer>();

        System.out.println("Enter the mobile nos. Please enter 0 to end input.");

        while (sc.hasNext())
        {
            //int flag = 0;
            while (!sc.hasNextInt())
            {
                sc.next();
                System.out.println("Please enter only 5 digit integers.");
            }
            int n = sc.nextInt();

            if (n == 0)
            {
                break;
            }
            else
                mobileNos.add(n);
        }

        System.out.println("Mobile nos as entered.");
        mobileNos.forEach(s-> System.out.println(s));

        // To remove duplicates, copy your list into set.
        Set<Integer> uniqueMobNos = new LinkedHashSet<Integer>();
        uniqueMobNos.addAll(mobileNos);

        System.out.println("\nUnique mobile nos in order they were entered");
        uniqueMobNos.forEach(s-> System.out.println(s));

    }
}
