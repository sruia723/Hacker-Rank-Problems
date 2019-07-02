interface Phone
{
    void call();
}

/*class AndroidPhone implements Phone
{

    @Override
    public void call() {
        System.out.println("Calling.");
    }
}*/

public class LambdaDemo {

    public static void main(String[] args) {

        /*Phone p = new AndroidPhone();
        p.call();*/

        // Anonymous inner class , means no name to the class.....But .class file is generated, memory is used.
        /*Phone p = new Phone()
        {
            @Override
            public void call() {
                System.out.println("Calling");
            }
        };*/

        //p.call();

        //To save the memory, we go for lambda expressions
        Phone p = () -> {
            System.out.println("Calling");
        };

        p.call();

    }
}
