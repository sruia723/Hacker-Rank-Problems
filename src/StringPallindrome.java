import java.util.Scanner;

public class StringPallindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter the given string.");
        String s = sc.next();

        int l = s.length();
        int c = 0;

        for (int i = 0; i < l/2; i++) {

                if (s.charAt(i) == s.charAt(l-1-i))
                {
                    c++;
                    continue;
                }
                else
                {
                    System.out.println("String is not a palindrome");
                    break;
                }
        }

        if (c == (l/2))
        {
            System.out.println("String is a palindrome");
        }

    }
}
