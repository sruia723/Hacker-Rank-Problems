import java.util.Scanner;

class Student{

    int rollnum, mark1, mark2, mark3, totalMarks;
    String studName;

    public void setStudDetails(int rollnum,int mark1,int mark2,int mark3,String studName)
    {
        this.rollnum = rollnum;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.studName = studName;
    }
    void calculateTotal()
    {
        totalMarks = mark1 + mark2 + mark3;
    }

    void displayStudDetails()
    {
        System.out.println("\n"+studName + "\nRoll no: "+ rollnum+ "\nMark1: "+mark1+ "\nMark2: "+mark2+ "\nMark3: "+mark3+"\nTotal marks: "+totalMarks);
    }

}

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students.");
        int num = sc.nextInt();
        sc.useDelimiter("\\n");

        Student s[] = new Student[num+1];// array of objects of Student class

        for (int i = 1 ; i <= num  ; i++)
        {
            System.out.println("Enter the detail of student " + i);
            System.out.println("Roll num: ");
            int rollnum = sc.nextInt();
            System.out.println("Name: ");
            String studname = sc.next();
            System.out.println("Mark of subject 1");
            int mark1 = sc.nextInt();
            System.out.println("Mark of subject 2");
            int mark2 = sc.nextInt();
            System.out.println("Mark of subject 3");
            int mark3 = sc.nextInt();
            s[i] = new Student();
            s[i].setStudDetails(rollnum,mark1,mark2,mark3,studname);
        }
        for (int i = 1; i <= num ; i++) {

            s[i].calculateTotal();
            s[i].displayStudDetails();
        }

    }
}
