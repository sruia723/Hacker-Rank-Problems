import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the element s of the list. Press done when done adding.");
        LinkedList ll = new LinkedList();

        while (sc.hasNext())
        {
            String s = sc.next();
            if (s.equals("done"))
                break;
            else
                ll.add(s);
        }

        // To traverse the list or set
        Iterator itr = ll.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\n\n");

        // ListIterator , ListIterator extends Iterator.
        ListIterator litr = ll.listIterator();

        // From first to last
        while(litr.hasNext())
            System.out.println(litr.next());
        System.out.println("\n\n");

        // From last to first
        while (litr.hasPrevious())
            System.out.println(litr.previous());
    }
}
