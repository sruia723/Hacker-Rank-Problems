import java.util.LinkedList;
import java.util.Scanner;

public class HotelMenuUsingLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("WELCOME TO RADHAA-KRISHNA BHAVAN");
        String des = "n";
        System.out.println("Do you want to enter the system? Y for yes and N for no.");
        des = sc.next();
        LinkedList<String>[] hotelMenu = new LinkedList[100]; // An array of lists
        int count = 0 , count1 = -1;

        // User enters the system at this point.
        while (des.equals("Y") || des.equals("y")) {

            // Initial menu
            System.out.println("\nPlease select from the below menu.");
            System.out.println("1) Create a menu.y\n2) Update an existing menu.\n3) Exit");

            // Selection of the option logic
            while (!sc.hasNextInt())
            {
                sc.next();
                System.out.println("Please choose the correct option from the menu.");
            }
            int n = sc.nextInt();

            switch (n)
            {
                // Creation of the menu.
                case 1:
                    System.out.println("Start creating a menu? Y for yes.");
                    String desCreate = sc.next();
                    while (desCreate.equals("y") || desCreate.equals("Y")) {

                        hotelMenu[count] = new LinkedList<String>();
                        System.out.println("Enter the name of the menu.");
                        hotelMenu[count].add(sc.next());
                        System.out.println("Please enter the elements. Please enter DONE when done creating. ");
                        while (sc.hasNext()) {
                            String s = sc.next();
                            if (s.equals("done") || s.equals("DONE")) {
                                break;
                            }
                            hotelMenu[count].add(s);
                        }
                        //System.out.println("Exiting creation.");

                        System.out.println("Following is the created menu.");
                        for (int i = 0; i < hotelMenu[count].size(); i++) {

                            if (i == 0) {
                                System.out.println(hotelMenu[count].get(i));
                            } else
                                System.out.println((i) + ") " + hotelMenu[count].get(i));
                        }
                        System.out.println("Do you want to create another menu. Y for yes or N for no");
                        desCreate = sc.next();
                        count1++;
                        if (desCreate.equals("y") || desCreate.equals("Y"))
                        {
                            count++;
                        }
                    }
                    break;
                case 2: // Editing a menu
                    System.out.println("Start editing a menu? Y for yes");
                    String desUpdate = sc.next();
                    if (count1 < 0 )
                    {
                        desUpdate = "n";
                        System.out.println("No menus present in the system, please create one before editing it.");
                    }
                    while (desUpdate.equals("y") || desUpdate.equals("Y")) {
                        System.out.println("Following are the menu options, select one to update.");
                        for (int i = 0; i <= count; i++) {
                            System.out.println((i + 1) + ") " + hotelMenu[i].get(0));
                        }
                        while (!sc.hasNextInt()) {
                            sc.next();
                            System.out.println("Please choose the correct option from the menu.");
                        }
                        int selectMenu = sc.nextInt();
                        selectMenu--;

                        if (selectMenu <= count)
                        {
                            String desEditMenu = "y";
                            while (desEditMenu.equals("y") || desEditMenu.equals("Y")) {
                                System.out.println("Please select from the following menu.");
                                System.out.println("1. Add element at last.\n2. Add element at first.");
                                System.out.println("3. Add element at given position.");
                                System.out.println("4. Update element at given position.");
                                System.out.println("5. Delete first element.\n6. Delete last element.");
                                System.out.println("7. Delete given element.");
                                System.out.println("8. Delete element at given position.\n9. Display elements");
                                System.out.println("10. Exit");

                                while (!sc.hasNextInt()) {
                                    sc.next();
                                    System.out.println("Please choose the correct option from the menu.");
                                }
                                int slectJob = sc.nextInt();

                                switch (slectJob)
                                {
                                    case 1:
                                        System.out.println("Please enter the element to be added.");
                                        hotelMenu[selectMenu].addLast(sc.next());
                                        System.out.println("Element added at last.");
                                        break;
                                    case 2:
                                        System.out.println("Please enter the element to be added.");
                                        hotelMenu[selectMenu].add(1,sc.next());
                                        System.out.println("Element added at first.");
                                        break;
                                    case 3:
                                        System.out.println("Please enter the element to be added.");
                                        String el1 = sc.next();
                                        System.out.println("Enter the position");
                                        while (!sc.hasNextInt()) {
                                            sc.next();
                                            System.out.println("Please enter an integer.");
                                        }
                                        int pos1 = sc.nextInt();
                                        if (pos1 <= hotelMenu[selectMenu].size() && pos1 != 0)
                                        {
                                            hotelMenu[selectMenu].add(pos1,el1);
                                            System.out.println("Element added.");
                                        }
                                        else
                                        {
                                            System.out.println("Please enter correct position.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Please enter the element.");
                                        String el2 = sc.next();
                                        System.out.println("Enter the position which it should be replaced");
                                        while (!sc.hasNextInt()) {
                                            sc.next();
                                            System.out.println("Please enter an integer.");
                                        }
                                        int pos2 = sc.nextInt();
                                        if (pos2 <= hotelMenu[selectMenu].size() && pos2 != 0)
                                        {
                                            hotelMenu[selectMenu].set(pos2,el2);
                                            System.out.println("Element has been updated.");
                                        }
                                        else
                                        {
                                            System.out.println("Please enter correct position.");
                                        }
                                        break;
                                    case 5:
                                        hotelMenu[selectMenu].remove(1);
                                        System.out.println("First element deleted.");
                                        break;
                                    case 6:
                                        hotelMenu[selectMenu].removeLast();
                                        System.out.println("Last element deleted.");
                                        break;
                                    case 7:
                                        System.out.println("Enter the element to be deleted.");
                                        String el3 = sc.next();
                                        int flag = 0;
                                        for (int i = 0; i < hotelMenu[selectMenu].size() ; i++) {
                                            if (el3.equals(hotelMenu[selectMenu].get(i)))
                                            {
                                                hotelMenu[selectMenu].remove(el3);
                                                flag = 1;
                                            }
                                        }
                                        if (flag == 1)
                                        {
                                            System.out.println("Element deleted");
                                        }
                                        else
                                        {
                                            System.out.println("Please try again.");
                                        }
                                        break;
                                    case 8:
                                        System.out.println("Enter the position of the element to be deleted.");
                                        while (!sc.hasNextInt()) {
                                            sc.next();
                                            System.out.println("Please enter an integer.");
                                        }
                                        int pos3 = sc.nextInt();
                                        if (pos3 <= hotelMenu[selectMenu].size() && pos3 != 0)
                                        {
                                            hotelMenu[selectMenu].remove(pos3);
                                            System.out.println("Element has been deleted.");
                                        }
                                        else
                                        {
                                            System.out.println("Please enter correct position");
                                        }
                                        break;
                                    case 9:
                                        System.out.println("Following are the list of items in this menu.");
                                        for (int i = 0; i < hotelMenu[selectMenu].size(); i++) {
                                            if (i == 0)
                                            {
                                                System.out.println(hotelMenu[selectMenu].get(i));
                                            }
                                            else
                                                System.out.println((i) + ". " + hotelMenu[selectMenu].get(i));
                                        }
                                        break;
                                    case 10:
                                        break;
                                    default:
                                        System.out.println("Please select the correct option.");
                                }

                                System.out.println("Do you want to continue editing this menu? Y for yes");
                                desEditMenu = sc.next();
                            }
                        }
                        else
                        {
                            System.out.println("Please select the correct option.");
                        }

                        System.out.println("Do you want to do more editing? Y for yes and N for no");
                        desUpdate = sc.next();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please select correct option from the menu.");
            }


            // Exit logic
            System.out.println("Do you want to remain in the system or exit? E for exit");
            String desLast = sc.next();
            if (desLast.equals("e") || desLast.equals("E"))
            {
                des = "n";
            }
            else
            {
                des = "y";
            }
        }
    }
}
