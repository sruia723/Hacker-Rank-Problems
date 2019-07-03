// try with resource, added in java 7.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.FileNameMap;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // connection with keyboard.
        try (br) // allowed from java 9
        {

            System.out.println("Enter num 1");
            int n = Integer.parseInt(br.readLine());
            System.out.println("Enter num 2");
            int m = Integer.parseInt(br.readLine());
            int sum = n + m ;
            System.out.println("Sum = " + sum);
            //br.close(); // We don't need to close(), it will close automatically
        }

        // below part not required with try with resource
        /*catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            br.close;
        }*/
    }
}
