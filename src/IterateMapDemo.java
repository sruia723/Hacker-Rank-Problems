import java.util.HashMap;
import java.util.Set;

public class IterateMapDemo {

    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Monitor", 5000); // hm.put(key, value);
        hm.put("Keyboard", 2000);
        hm.put("mouse", 1000);
        hm.put("speakers", 1500);
        hm.put("modem", 1500);
        System.out.println(hm);

        Set<String> keys = hm.keySet(); // keys stored in the set

        for (String k: keys
             ) {
            System.out.println(k + " : " + hm.get(k));
        }

    }
}
