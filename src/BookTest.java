import java.util.Scanner;

class Book
{
    int bno, price;
    String bname;

    Book(int bno, int price, String bname) // Parameterised constructor
    {
        this.bno = bno;
        this.price = price;
        this.bname = bname;
    }

    Book() // default constructor
    {

    }

    public void display()
    {
        System.out.println("Book number: #" + bno);
        System.out.println("Book name: " + bname);
        System.out.println("Price of book: $" + price);
    }

}

class SpecialEditionBook extends Book
{
    int discount;

    SpecialEditionBook(int bno, int price, String bname, int discount)
    {
        super(bno,price,bname); // To set te values of elements in book.
        this.discount = discount;
    }

    SpecialEditionBook() // default constructor
    {

    }

    public void display()
    {
        super.display(); // to use display() of parent class
        if (discount == 0)
        {
            System.out.println("Book is not special edition, discount is $" + discount);
        }
        else {
            System.out.println("Discount on special edition: $" + discount );
            price = price - discount;
            System.out.println("Price after discount on special edition: $" + price);
        }
    }
}


public class BookTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the number of books.");
        int n = sc.nextInt();

        SpecialEditionBook s[] = new SpecialEditionBook[n+2];
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details of book " + i + ":");
            System.out.println("Enter book number: ");
            int bno = sc.nextInt();
            System.out.println("Enter book name: ");
            String bname = sc.next();
            System.out.println("Enter the price: ");
            int price = sc.nextInt();
            System.out.println("Enter the discount: ");
            int dicount = sc.nextInt();
            s[i] = new SpecialEditionBook(bno,price,bname,dicount);
        }

        String des = "y";
        System.out.println("Do you want to use our system? Y for yes and N for no.");
        des = sc.next();
        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("\nEnter the book number from menu below.");
            for (int i = 1; i <= n ; i++) {
                System.out.println(s[i].bno + " " + s[i].bname);
            }
            int num = sc.nextInt();
            String decision = "";

            for (int i = 1; i <= n+1 ; i++) {
                if (s[i].bno == num)
                {
                    System.out.println("\nBelow are the details of the book:");
                    s[i].display();
                    System.out.println("\nDo you want to buy the book?");
                    decision = sc.next();
                    if (decision.equals("y")||decision.equals("Y")) {
                        System.out.println("Thank you for shopping with us.");
                        break;
                    }
                    else {
                        break;
                    }
                }
                if (i >= n)
                {
                    System.out.println("Enter the correct book number from the menu.");
                    break;
                }
            }
            System.out.println("\nDo you want to remain in the system and checkout more books?");
            des = sc.next();
        }


    }
}
