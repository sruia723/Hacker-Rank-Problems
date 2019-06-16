import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sock[] = new int[n];

        for (int i = 0; i < n; i++) {

            sock[i] = sc.nextInt();
        }

        Map<Integer, Integer> socks = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (socks.containsKey(sock[i])) {

                socks.put(sock[i],socks.get(sock[i])+1 );
            }
            else
            {
                socks.put(sock[i],1);
            }

        }

        /*for (Map.Entry entry : socks.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        int sum = 0;
        for (Map.Entry<Integer, Integer> pair : socks.entrySet()) {
            int i = pair.getValue();
            sum = sum + (i/2);
        }

        System.out.println(sum);

    }
}
