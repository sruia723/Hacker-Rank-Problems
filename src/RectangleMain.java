import java.util.Scanner;

class Rectangle{

    float length, breadth;
    String unit;

    Rectangle(float length, float breadth, String unit)// Constructor
    {
        this.length = length;
        this.breadth = breadth;
        this.unit = unit;
    }

    public void area()
    {
        float area = length * breadth;
        System.out.println("Area of the rectangle is: " + area + " " + unit + " sqr.");
    }

    public void perimeter()
    {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle is: " + perimeter + " " + unit + "s");
    }

    public void lengthOfDigonal()
    {
        double diagonal = length*length + breadth*breadth;
        diagonal = Math.sqrt(diagonal);
        System.out.println("\nLength of diagonal is: " + diagonal + " " + unit + "s");
    }
}


public class RectangleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String des = "y";

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the length of the rectangle.");
            float l = sc.nextFloat();
            System.out.println("Enter the breadth of the rectangle.");
            float b = sc.nextFloat();
            System.out.println("Enter the unit of measurement.");
            String unit = sc.next();
            Rectangle r = new Rectangle(l,b,unit);// call to the constructor.
            r.lengthOfDigonal();
            r.perimeter();
            r.area();
            System.out.println("\nDo you want to use the app again? Y for yes and N for no");
            des = sc.next();
        }

        sc.close();
    }
}
