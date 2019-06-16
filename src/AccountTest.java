import java.util.Scanner;

class Customer{

     int custId;
    String custName ,custAddress;
    Customer(int custId, String custName, String custAddress)// Constructor
    {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public void displayCust()
    {
        System.out.println("\nCustomer id: " + custId);
        System.out.println("Customer name: " + custName);
        System.out.println("Customer address: " + custAddress);
    }
}

class Account2{

    int acctId, acctBalance;
    String acctType;
    Customer c;
    Account2(int acctId, int acctBalance, String acctType, Customer c)// Constructor
    {
        this.c = c;
        this.acctId = acctId;
        this.acctBalance = acctBalance;
        this.acctType = acctType;
    }

    public void display()
    {
        c.displayCust();
        System.out.println("Account id: " + acctId);
        System.out.println("Account type: " + acctType);
        System.out.println("Account balance: $" + acctBalance);
    }
}

public class AccountTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the number of customers.");
        int n = sc.nextInt();

        //Customer c[] = new Customer[n+1];
        Account2 a[] = new Account2[n+1];
        Customer c[] = new Customer[n+1];

        String des = "y";
        System.out.println("Set details of account and customer.");
        for (int i = 1; i <= n ; i++) {
            System.out.println("\nEnter the details of customer " + i);
                System.out.println("Enter the customer name.");
                String cxName = sc.next();
                System.out.println("Enter the customer id.");
                int cxID = sc.nextInt();
                System.out.println("Enter the customer address.");
                String cxAdd = sc.next();
                System.out.println("Enter account id.");
                int accID = sc.nextInt();
                System.out.println("Enter account type.");
                String acctype = sc.next();
                System.out.println("Enter the account balance.");
                int accBalance = sc.nextInt();
                c[i] = new Customer(cxID,cxName,cxAdd);
                a[i] = new Account2(accID,accBalance,acctype,c[i]);
        }

        System.out.println("\nDo you wan to use our system? Enter Y for yes and N for no.");
        des = sc.next();
        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("Enter the account id please.");
            int decision = 0;
            int id = sc.nextInt();
            for (int i = 1; i <= n ; i++) {
                if (id == a[i].acctId){
                    while (decision != -1)
                {
                    System.out.println("\nChoose from the menu below:");
                    System.out.println("Press 1 to display all the details.");
                    System.out.println("Press 2 to exit.");
                    int k = sc.nextInt();
                    switch (k)
                    {
                        case 1:
                            a[i].display();
                            break;
                        case 2:
                            System.out.println("Thank you.");
                            decision = -1;
                            break;
                        default:
                            System.out.println("Please try again from the menu");
                    }
                }
                }
                if(i==n && decision != -1){
                    System.out.println("Please enter the correct id.");
                    break;
                }
            }
            System.out.println("Do you want to use system again? Y for yes and N for no.");
            des = sc.next();
        }


    sc.close();
    }
}
