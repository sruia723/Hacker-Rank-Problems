import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);

        // Adds at the last position
        al.add(20);
        al.add("Kimmi is Radhaa, Radhaa is Kimmi");
        al.add("Sanchit is Krishna, Krishna is Sanchit");
        System.out.println(al);

        // Adds at specific position
        al.add(4,"Love of Radhaa-Krishna flowing in Kimmi-Sanchit");
        System.out.println(al);
        al.add(5,"Radhaa-Krishna");
        System.out.println(al);

        // Sets/updates the value at certain position
        al.set(5,"Radha-Krishna are one");
        System.out.println(al);

        // remove() method.
        al.add("Chotu Shiv");
        System.out.println(al);
        al.remove("Chotu Shiv"); // remove by element.
        System.out.println(al);
        al.add("Chotu Shiv");
        System.out.println(al);
        al.remove(6); // Remove by index
        System.out.println(al);

        // get() method
        String s = (String) al.get(5);
        System.out.println(s);
        int n = (int) al.get(1);
        System.out.println(n);

        // size() method
        System.out.println("Size = " + al.size());

    }
}
