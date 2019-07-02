// Example of abstract class
import java.util.Scanner;

abstract class Fruit{

   public abstract void setcost(int cost);
    public abstract void getcost();
}

class Apple extends Fruit
{
    private int cost = 0;// declared the data member as private to add security
    @Override
    public void setcost(int cost) {

        this.cost = cost;
    }

    public void getcost()
    {
        System.out.println("Cost of Apple = " + cost);
    }
}

class Mango extends Fruit
{
    private int cost = 0;// declared the data member as private to add security
    @Override
    public void setcost(int cost) {

        this.cost = cost;
    }

    public void getcost()
    {
        System.out.println("Cost of Mango = " + cost);
    }
}


public class FruitDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter the cost of Apple?");
        Fruit a = new Apple();
        int c = sc.nextInt();
        a.setcost(c);
        System.out.println("Enter the cost of Mango?");
        Fruit m = new Mango();
        c = sc.nextInt();
        m.setcost(c);

        a.getcost();
        m.getcost();



    }
}
