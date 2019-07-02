// sOMETIME IS ALLOCATED FOR MYTHREAD AND SOMETIME FOR YOURTHREAD
// If program is already into run state and you again call t.start() it throws IllegalThreadstateException.
// When an Exception occurs it terminates the current thread.


class MyThread extends Thread
{
    @Override
    public void run() {

        System.out.println("I'm a thread.");
        Thread t = Thread.currentThread();
        t.setName("My thread");
        for (int i = 1; i <= 10; i++) {

            System.out.println(t.getName() + " : " + i);

            // To send thread into block state, Thread.sleep()
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        //System.out.println(t);

    }
}

class YourThread extends Thread
{

    @Override
    public void run() {

        Thread t = Thread.currentThread();
        t.setName("Your thread");
        for (int i = 1; i <= 10; i++) {

            System.out.println(t.getName() + " : " + i);

            // To send thread into block state, Thread.sleep()
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadMethodsDemo {

    public static void main(String[] args) {

        //long starttime = System.currentTimeMillis();

        MyThread t = new MyThread();
        t.start();
        //t.run(); // ordinary programming

        YourThread t2 = new YourThread();
        t2.start();
        //t2.run(); // ordinary programming

        // Join method is used so that the the thread execution is done and then the control returns to main()
        /*try{t.join();}
        catch (Exception e){}
        try{t2.join();}
        catch (Exception e){}*/

        //long endtime = System.currentTimeMillis();
        //System.out.println("Total time = " + (endtime - starttime));
    }
}
