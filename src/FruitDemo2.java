// Example of Interface


import java.util.Scanner;

interface FruitInterface
{
    int tax = 5;
    void setcost(int cost);
    void getcost();
}

class Apple1 implements FruitInterface
{
    int cost = 0;

    @Override
    public void setcost(int cost) {

        this.cost = cost + tax;
    }

    @Override
    public void getcost() {
        System.out.println("Cost of Apple inclusive of all taxes = " + cost);
    }
}

class Mango1 implements FruitInterface
{
    int cost = 0;
    @Override
    public void setcost(int cost) {

        this.cost = cost + tax;
    }

    @Override
    public void getcost() {
        System.out.println("Cost of Mango inclusive of all taxes = " + cost);
    }
}


public class FruitDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter the cost of Apple?");
        FruitInterface a = new Apple1();
        int c = sc.nextInt();
        a.setcost(c);
        System.out.println("Enter the cost of Mango?");
        FruitInterface m = new Mango1();
        c = sc.nextInt();
        m.setcost(c);

        a.getcost();
        m.getcost();
    }
}
