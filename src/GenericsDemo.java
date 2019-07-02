import java.util.Scanner;

class GenClass <T> // letter T can be any letter
{
    private T i;

    GenClass(T i)
    {
        this.i = i;
    }

    T getVal()
    {
        return i;
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the value of integer.");
        GenClass<Integer> ic = new GenClass<Integer>(sc.nextInt());

        System.out.println("Enter the value of string.");
        GenClass<String> is = new GenClass<String>(sc.next());

        System.out.println("\nInteger = " + ic.getVal());
        System.out.println("String = " + is.getVal());
    }
}
