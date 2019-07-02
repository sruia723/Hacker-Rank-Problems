import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        // HashSet is unordered and no duplicates
        HashSet h = new HashSet();
        h.add("monitor");
        h.add("Keyboard");
        h.add("mouse");
        h.add("speakers");
        h.add("modem");
        //h.add("modem"); // duplicate elements will not be added.
        System.out.println(h.add("modem") + " --- Cannot add, because it's duplicate"); // will return false
        System.out.println(h);

        // LinkedHashSet is ordered[the way we add, is the way we get] and no duplicates
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("monitor");
        lh.add("Keyboard");
        lh.add("mouse");
        lh.add("speakers");
        lh.add("modem");
        //h.add("modem"); // duplicate elements will not be added.
        System.out.println(lh.add("modem") + " --- Cannot add, because it's duplicate"); // will return false
        System.out.println(lh);

        // TreeSet is sorted and no duplicates
        TreeSet ts = new TreeSet();
        ts.add("monitor");
        ts.add("Keyboard");
        ts.add("mouse");
        ts.add("speakers");
        ts.add("modem");
        //ts.add(10); // this will give ClassCastException because in TreeSet elements need to be of same type to be compared.
        //h.add("modem"); // duplicate elements will not be added.
        System.out.println(ts.add("modem") + " --- Cannot add, because it's duplicate"); // will return false
        System.out.println(ts);
        System.out.println(ts.descendingSet());


    }
}
