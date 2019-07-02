import java.util.Scanner;

class SumEven extends Thread
{
    private long sumE;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        for (int i = 0; i <= num; i++) {

            if ((i % 2) == 0) {
                sumE = sumE + i;
            }
        }

        synchronized (this){
            notify();
        }
    }

    public long getSumE() {
        return sumE;
    }
}

class SumOdd extends Thread
{

    private long sumO;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        for (int i = 0; i <= num; i++) {

            if ((i%2) != 0)
            {
                sumO = sumO + i;
            }
        }

        synchronized (this){
            notify();
        }
    }

    public long getSumO() {
        return sumO;
    }
}


public class SumEvenSumOddMultithreading {

    public static void main(String[] args) {

        // Object of Scanner class created to take input from the console.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        // User prompted to enter an integer
        System.out.println("Enter the number upto which you want th sum of even and odd integers.");


        // Following code is to make sure that the user enters only integer value.
        while (!sc.hasNextInt())
        {
            sc.next();
            System.out.println("Please enter an integer: ");
        }
        int num = sc.nextInt();

        // Object of threaded classes created
        SumEven se = new SumEven();
        SumOdd so = new SumOdd();

        // Value of number given to the objects
        se.setNum(num);
        so.setNum(num);

        // Threads started
        se.start();
        so.start();

        // main() thread told to wait until the execution of se and so completed.
        synchronized (se) {
            try {
                se.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (so) {
            try {
                so.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Sum of even and odd integers taken from the objects
        long sumE = se.getSumE();
        long sumO = so.getSumO();

        // Values of sum displayed
        System.out.println("Sum of even = " + sumE + "\nSum of odd = " + sumO);


    }
}
