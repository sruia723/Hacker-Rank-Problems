import java.util.ArrayList;
import java.util.Scanner;

public class UsingGenericsInCollections {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        ArrayList<String> als = new ArrayList<String>();
        // from java 7 giving data type on right side is optional.

        System.out.println("Enter the elements. Press done when done");

        while (sc.hasNext())
        {
            String s = sc.next();
            if (s.equals("done"))
                break;
            else
                als.add(s);
        }

        System.out.println("\nUsing enhanced for loop.");
        // Traversing the list using enhanced for loop
        for (String s: als
             ) {
            System.out.println(s);
        }

        System.out.println("\nUsing forEach");
        // From java 8 version use forEach.
        als.forEach(o -> System.out.println(o));

    }
}
