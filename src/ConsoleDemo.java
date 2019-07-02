// This program will work ok in command line
// Console has a constructor which is not visible

import java.io.Console;

public class ConsoleDemo {

    public static void main(String[] args) {

        Console c = System.console();

        System.out.println("Enter the username.");
        String uname = c.readLine();

        System.out.println("Enter the pw");
        char[] pw = c.readPassword();

        String pwd = String.valueOf(pw); // to convert char array to string

        if (uname.equals("admin") && pwd.equals("admin"))
        {
            System.out.println("Login success.");
        }
        else
        {
            System.out.println("Login failure.");
        }
    }
}
