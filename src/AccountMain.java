import java.util.Scanner;

class Account
{
    Scanner sc = new Scanner(System.in);
    int accountNo , accountBalance;
    String accountType;

    public void setAccountDteails()
    {
        sc.useDelimiter("\\n");
        System.out.println("Enter the account number: ");
        accountNo = sc.nextInt();
        System.out.println("Enter the account balance: ");
        accountBalance = sc.nextInt();
        System.out.println("Enter the account type: ");
        accountType = sc.next();
    }

    public void withdraw()
    {
        System.out.println("Enter the amount to withdraw.");
        int amount = sc.nextInt();
        if (accountBalance < amount)
            System.out.println("Please enter amount less than or equal to balance.");
        else {
            accountBalance = accountBalance - amount;
            System.out.println("The new balance is $" + accountBalance);
        }
    }

    public void deposit()
    {
        System.out.println("Enter the amount to deposit.");
        int amount = sc.nextInt();
        accountBalance = accountBalance + amount;
        System.out.println("The new balance is $" + accountBalance);
    }

    public void dispAccountDetails()
    {
        System.out.println("\nAccount no: #" + accountNo);
        System.out.println("Account type: " + accountType);
        System.out.println("Account balance: $" + accountBalance);
    }

}
public class AccountMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter the number of accounts you want to add in the system.");
        int n = sc.nextInt();

        Account a[] = new Account[n+1];
        // heare the detail have been added
        for (int i = 1; i <= n; i++) {
            a[i] = new Account();
            System.out.println("Enter the details of account " + i);
            a[i].setAccountDteails();
        }

        // Here is the user part
        System.out.println("Do you want to use our banking app? Y for yes and N for no.");
        String descision = sc.next();

        while (descision.equals("Y") || descision.equals("y")){
        System.out.println("Enter the account number: ");
        int accNum = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            if(a[i].accountNo == accNum) {
                int des = 0;
                while (des != -1){
                    System.out.println("\nSelect from the menu:\nPress 1 for account details.\nPress 2 to withdraw\nPress 3 to deposit.\nPress 4 for exit.");
                    des = sc.nextInt();
                    switch (des) {
                        case 1:
                            a[i].dispAccountDetails();
                            break;
                        case 2:
                            a[i].withdraw();
                            break;
                        case 3:
                            a[i].deposit();
                            break;
                        case 4:
                            des = -1;
                            break;
                        default:
                            System.out.println("Try again from the menu.");
                        }
                    }
                }
            }
            System.out.println("You want to use system again? Y for yes and N for no.");
            descision = sc.next();
        }
    sc.close();
    }
}
