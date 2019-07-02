public class FinallyDemo {

    public static void main(String[] args) {

        try {
            System.out.println("try block");
            int res = 10 / 0;
            System.out.println("End of try block");
        }
        catch (Exception e)
        {
            System.err.println("\nCatch block");
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("End of program");
    }
}
