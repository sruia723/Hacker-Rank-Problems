import java.util.Scanner;

public class Discount {


    public static void billCal(int itemNum,int quantity, String name, double rate)
    {

        double price = 0, discount = 0, subPrice = 0;
        subPrice = rate * quantity;

        if (subPrice < 1000)
        {
            discount = 0;
            price = subPrice;
        }
        else if ( (subPrice >= 1000.0) && (subPrice < 2000.0))
        {
            discount = subPrice * 0.1;
            price = subPrice - discount;
        }
        else if ( (subPrice >= 2000.0) && (subPrice < 3000.0))
        {
            discount = subPrice * 0.15;
            price = subPrice - discount;
        }
        else if ( (subPrice >= 3000.0) && (subPrice < 5000.0))
        {
            discount = subPrice * 0.2;
            price = subPrice - discount;
        }
        else //if (subPrice >= 5000.0)
        {
            discount = subPrice * 0.25;
            price = subPrice - discount;
        }
        System.out.println("Your bill is as follows: ");
        System.out.println("Item number: #"+itemNum+"\nItem name: "+name+"\nRate: $"+rate +"\nQuantity: "+quantity+
                "\nSubtotal price: $"+subPrice+"\nDiscount: $"+discount+"\nTotal price: $"+price);

    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        sc.useDelimiter("\\n");// To take input with space

        int itemNum = 0, quattity = 0;
        String name = "", des = "y";
        double rate = 0;

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the item number: ");
            itemNum = sc.nextInt();
            System.out.println("Enter the name of the item: ");
            name = sc.next();
            System.out.println("Enter the rate of the item: ");
            rate = sc.nextDouble();
            System.out.println("Enter the quantity of the item: ");
            quattity = sc.nextInt();

            billCal(itemNum,quattity,name,rate);
            System.out.println("Do you want to buy more items? Press 'y' for yes and 'n' for no");
            des = sc.next();
        }
    sc.close();
    }
}
