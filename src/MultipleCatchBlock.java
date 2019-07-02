// The order of catch block must be from subclass to superclass

public class MultipleCatchBlock {

    public static void main(String[] args) {

        try {

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int res = n1 / n2 ;
            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Cannot divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Requires 2 numbers");
        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter only integers");
        }
        // Because any type of exception may occur
        catch (RuntimeException e)
        {
            System.err.println("A runtime exception occurred");
        }
        catch (Exception e)
        {
            System.err.println("An exception occurred");
        }
    }
}
