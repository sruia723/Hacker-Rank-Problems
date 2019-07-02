import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        // Compiler will let you know that some methods throw exceptions. Just surround them in try catch block
        // Or it can be declared to be thrown
        int n = 0;
        try {
             n = System.in.read();// reads int value from the system.
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Number is " + n);// shows the ascii value of the symbol
    }
}
