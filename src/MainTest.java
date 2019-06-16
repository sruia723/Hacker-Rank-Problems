// If main() method is present, then we have to declare mai() method as static

class Base
{
  int  n =10;
    public void dis(){}
}
class B1 extends Base
{
    int n = 20;
    public void dis()
    {
        n += 30;
        System.out.println(super.n);
    }
}

public class MainTest {

    public static void main(String[] args) {


        System.out.println("Hello");
        Base b = new B1();
        b.dis();
    }
}
