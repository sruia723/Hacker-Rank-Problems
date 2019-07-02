
class ThreadR implements Runnable
{
    @Override
    public void run() {

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(i);
        }
    }
}


public class RunnableDemo {

    public static void main(String[] args) {

        ThreadR t = new ThreadR();

        // When we implement Runnable interface we have to create an object of Thread class and then pass the
        // object of our class to it's constructor.
        // We do this because Runnable interface doesn't have start() method.

        Thread t1 = new Thread(t);
        t1.start();
    }
}
