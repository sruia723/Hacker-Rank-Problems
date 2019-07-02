// This src code also demonstrates exception handling
// Command line arguments given are 10 and 0
// Exceptions occur during runtime or execution
// Exception handling is used to avoid abnormal termination of the program during runtime.


public class CommandLineArguments {

    public static void main(String[] args) {

        System.out.println("Beginning of the program: ");
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        try {

            float res = n1 / n2 ;
            System.out.println("Result = " + res); // This statement in included because it is depended on previous one.
        }
        catch (Exception e) // Exception is a class. Catch block executed only if Exception occurs
        {
            System.out.println("\nDivision by 0 is not allowed.\n");
            System.err.println("Division by 0 is not allowed.");//To print in red colour
        }
        System.out.println("End of the program:");
    }
}
