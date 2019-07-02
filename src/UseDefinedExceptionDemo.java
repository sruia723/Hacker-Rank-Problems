import java.util.Scanner;

// Below is user defined exception class AgeException
class AgeException extends Exception
{
    AgeException(String s)
    {
        super(s); // call to super class constructor
    }
    AgeException(){} // default constructor
}


class Customers
{
    private int age;
    private String name;

    public void setAge(int age) throws AgeException
    {
        if (age < 18 || age > 60)
            throw new AgeException("Age should be between 18 and 60");
        else
            this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAgeAndName() {
        System.out.println("Name of Customer = " + name);
        System.out.println("Age of Customer = " + age);
    }
}


public class UseDefinedExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the name of the customer");
        String name = sc.next();
        System.out.println("Enter the age of the Customer");
        int age = sc.nextInt();

        Customers c = new Customers();
        try {
            c.setAge(age);
        } catch (AgeException e) {
            System.err.println(e);
            System.out.println(e.getMessage());//To print only the message of exception
        }
        c.setName(name);

        c.getAgeAndName();



    }
}
