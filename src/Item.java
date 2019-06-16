import java.util.Scanner;
// Following code is for an application which is used by an employee of a restaurant, and he takes orders from the customers.
// Initial part is decided by the seller, it contains construction of the menu.
// Menu is only made once, hence it is constructed in the 'main' method itself.

public class Item {

    static Scanner s = new Scanner(System.in); // object of 'Scanner' class is 'static' because 'main' is static.

    private static void user(String items[], double rate[], int n, String nameCX, String comName) // item list and their rates is given as the parameters
    {
        double sumRate = 0;
        System.out.println("Below is the menu of the items");

        for (int i = 1; i <= n; i++) {

            System.out.println(i + ") " + items[i] + " $" + rate[i] );
            sumRate += rate[i];
        }

        System.out.println("\nHow many different types of items you want to purchase?");
        int num = s.nextInt();
        int SerialNum[] = new int[num+1];
        int quantity[] = new int[num+1];
        double price[] = new double[num+1];
        for (int i = 1; i <= num; i++) {

            System.out.println("Enter the serial number of item from the menu you want to purchase: ");
            SerialNum[i] = s.nextInt();
            System.out.println("Enter the quantity: ");
            quantity[i] = s.nextInt();
            price[i] = rate[SerialNum[i]] * quantity[i];
        }


        System.out.println("\nBill for " + nameCX + ":" );
        double dis = 0;
        double grandTotal = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(quantity[i] + " pieces of " + items[SerialNum[i]] + " for $" + price[i] + " at $" + rate[SerialNum[i]] + " each");
            grandTotal = grandTotal + price[i];
        }
        // Below is for discount

        System.out.println("Total to pay: $" + grandTotal);
        System.out.println("Thank you for visiting '"+comName+"', have a great day!\n");
    }

    public static void main(String[] args) {

        // This part is for the seller
        System.out.println("Make the menu of your company.\n");
        System.out.println("Enter the number of items: ");

        int n = s.nextInt();
        s.useDelimiter("\\n");// TO take string input with spaces

        String items[]= new String[n+1];
        double rate[] = new double[n+1];
        items[0] = " "; rate[0] = 0;
        System.out.println("Enter the names and corresponding rates of items: ");
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the name of " + i +  " item: ");
            items[i] = s.next();
            System.out.println("Enter its rate: ");
            rate[i] = s.nextDouble();
        }
        System.out.println("The menu is ready.");



        // Next part is for the employee
        System.out.println("\nEnter the name of your company.");
        String comName = s.next();
        String decision = "Y";
        System.out.println("Do you want to start the application?\nPress 'Y' for yes and 'N' for no." );
        decision = s.next();
        while (decision.equals("y") || decision.equals("Y"))// here the employer starts the application
        {
            System.out.println("\nEnter the name of the customer: ");
            String nameCX = s.next();
            System.out.println("\nHello " + nameCX + ",\nWelcome to " + comName +"\n");
            user(items, rate, n, nameCX, comName);// call to the user function
            System.out.println("Do you want to serve next customer?\nPress 'Y' for yes and 'N' for no.");
            decision = s.next();
        }

    }
}