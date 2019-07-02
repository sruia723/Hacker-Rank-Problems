import java.util.Scanner;

public class VowelsConsonentsWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter the string: ");
        String s = sc.next();

        s.trim(); // to remove the spaces before and after the words.

        int c1 = 0, c2 = 0, c3 = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                c1++;
            }
            else if (s.charAt(i) == ' ')
            {
                c3++;
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z')
            {
                c2++;
            }
        }

        System.out.println("Number of vowels = " + c1);
        System.out.println("Number of consonents = " + c2);
        System.out.println("Number of words = " + (c3+1));

    }
}
