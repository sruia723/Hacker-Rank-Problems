import java.util.Scanner;

class WithdrawException extends Exception
{
    WithdrawException(String s)
    {
        super(s);
    }

    WithdrawException(){}
}

class CustomerAccounts
{
    private int accNum;
    private String accName;
    private double accBal;

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }


    public void display()
    {
        System.out.println("\nBelow are the details of your account:");
        System.out.println("Account name: " + accName);
        System.out.println("Account number: " + accNum);
        System.out.println("Account balance: " + accBal);
    }

    public void withdraw(double amt) throws WithdrawException {
        if (amt > accBal)
        {
            throw new WithdrawException("Insufficient balance.");
        }
        else
        {
            accBal = accBal - amt ;
        }
    }
}


public class WithdrawExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the name of the customer");
        String name = sc.next();

        System.out.println("Enter the account number");
        int accnum = sc.nextInt();

        System.out.println("Enter the initial balance");
        double accbal = sc.nextDouble();

        CustomerAccounts c = new CustomerAccounts();
        c.setAccName(name); c.setAccNum(accnum); c.setAccBal(accbal);

        System.out.println("Press y to use the system an n for no");
        String des = sc.next();

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("\nChoose from the menu below: ");
            System.out.println("1) To withdraw");
            System.out.println("2) To display");
            int decision = sc.nextInt();

            switch (decision)
            {
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    double amt = sc.nextDouble();
                    try {
                        c.withdraw(amt);
                    } catch (WithdrawException e) {
                        System.err.println("\n" + e);
                    }
                    break;
                case 2:
                    c.display();
                    break;
                default:
                    System.out.println("Please choose correct option from the menu.");
            }

            System.out.println("Press y to remain in system and n to exit");
            des = sc.next();
        }
    }
}
