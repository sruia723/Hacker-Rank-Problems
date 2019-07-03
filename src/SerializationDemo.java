import java.io.*;

class ProductSerialization implements Serializable // has to implement Serializable interface.
{
    private int pno;
    private String pname;
    private transient double pprice;
    // include 'transient' keyword to not include a member in Serialisation

    ProductSerialization(int pno, String pname, double pprice)
    {
        this.pno = pno;
        this.pname = pname;
        this.pprice = pprice;
    }

    ProductSerialization(){} // default constructor.

    @Override
    public String toString() {
        return (pno + " " + pname + " $" + pprice);
    }
}
public class SerializationDemo {

    public static void main(String[] args) throws Exception {

        //Serialization
        FileOutputStream fos = new FileOutputStream("productSerialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ProductSerialization p1 = new ProductSerialization(1,"Geetaa",999999);
        oos.writeObject(p1);
        oos.close();
        fos.close();

        //De-serialization
        FileInputStream fis = new FileInputStream("productSerialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ProductSerialization p2 = (ProductSerialization) ois.readObject();

        System.out.println(p2); // invokes toString implicitly

        ois.close();
        fis.close();


    }
}
