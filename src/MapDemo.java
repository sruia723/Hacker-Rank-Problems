// Map is an interface
// Used to collect data in the form of key value pairs.
// No duplicate keys allowed.

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        // HashMap is unordered[stored randomly, we get randomly] and no duplicate keys
        HashMap hm = new HashMap();
        hm.put("Monitor", 5000); // hm.put(key, value);
        hm.put("Keyboard", 2000);
        hm.put("mouse", 1000);
        hm.put("speakers", 1500);
        hm.put("modem", 1500);
        System.out.println(hm);

        // LinkedHashMap is ordered[the way we add, is the way we get] and no duplicate keys
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Monitor", 5000); // hm.put(key, value);
        lhm.put("Keyboard", 2000);
        lhm.put("mouse", 1000);
        lhm.put("speakers", 1500);
        lhm.put("modem", 1500);
        System.out.println(lhm);

        // TreeMap is sorted and no duplicate keys.
        TreeMap tm = new TreeMap();
        tm.put("Monitor", 5000); // hm.put(key, value);
        tm.put("Keyboard", 2000);
        tm.put("mouse", 1000);
        tm.put("speakers", 1500);
        tm.put("modem", 1500);
        System.out.println(tm); // ascending order based on keys.
        System.out.println(tm.descendingMap()); // descending order based on keys

    }
}
