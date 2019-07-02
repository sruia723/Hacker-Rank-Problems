
class ThreadSum extends Thread
{
    private int sum;
    @Override
    public void run() {


        for (int i = 1; i <= 100 ; i++) {

            sum = sum + i;
        }
        synchronized (this) {
            notify();
        }
    }

    public int getSum()
    {
        return sum;
    }
}

public class InterThreadDemo {

    public static void main(String[] args) {

        ThreadSum ts = new ThreadSum();
        ts.start();
        synchronized (ts) {
            try {
                ts.wait();

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Sum = " + ts.getSum());

        // We are getting o/p as 'Sum = 0' because,
        // There are 2 running threads - main() and ts
        // So main gets finished before ts starts. We cannot guarantee which thread executes.
        // Hence we use sychronized concept.

    }
}
