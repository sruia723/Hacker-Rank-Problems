package com.account.test;

import com.account.Account;
import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        String des1 = "y";

        System.out.println("WELCOME TO Sanchit's-BANK");
        System.out.println("\nDo you want to enter the system? \nPress Y for yes and N for no: ");
        des1 = sc.next();
        int count = 1;
        Account a[] = new Account[101];// can create upto 100 accounts

        while (des1.equals("y") || des1.equals("Y"))
        {
            System.out.println("\nChoose from the below menu by entering the corresponding number: ");
            System.out.println("1) To create a new account\n2) To withdraw your money" +
                                "\n3) To deposit money into the account\n4) To display account details"
                                + "\n5) To exit the system");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    int accid; double accbal; String acctype, accpwd;
                    System.out.println("Enter the unique account id: ");
                    accid = sc.nextInt();
                    System.out.println("Enter the account type: ");
                    acctype = sc.next();
                    System.out.println("Enter the pw: ");
                    accpwd = sc.next();
                    System.out.println("Enter your initial balance: ");
                    accbal = sc.nextDouble();
                    a[count] = new Account(accid,accbal,acctype,accpwd);
                    System.out.println("Your account has been created.");
                    count++;
                    break;
                case 2:
                    int c1 = 0;
                    System.out.println("Enter your account id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter you account password: ");
                    String pw = sc.next();
                    System.out.println("Enter the amount to withdraw: ");
                    double amt = sc.nextDouble();
                    for (int i = 1; i < count; i++) {
                        c1 = a[i].withdraw(amt,id,pw);
                        if (c1 == 1)
                        {
                            break;
                        }
                    }
                    if (c1 == 0)
                    {
                        System.out.println("Please enter correct id and pw.");
                    }
                    break;
                case 3:
                    int c2 = 0;
                    System.out.println("Enter your account id: ");
                    int id1 = sc.nextInt();
                    System.out.println("Enter you account password: ");
                    String pw1 = sc.next();
                    System.out.println("Enter the amount to deposit: ");
                    double amt1 = sc.nextDouble();
                    for (int i = 1 ; i < count ; i++) {
                        c2 = a[i].deposit(amt1,id1,pw1);
                        if (c2 == 1)
                        {
                            break;
                        }
                    }
                    if (c2 == 0)
                    {
                        System.out.println("Please enter correct id and pw.");
                    }
                    break;
                case 4:
                    int c3 = 0;
                    System.out.println("Enter your account id: ");
                    int id2 = sc.nextInt();
                    System.out.println("Enter you account password: ");
                    String pw2 = sc.next();
                    System.out.println("Following are the details of your account.");
                    for (int i = 1; i < count ; i++) {
                        c3 = a[i].display(id2,pw2);
                        if (c3 == 1)
                        {
                            break;
                        }
                    }
                    if (c3 == 0)
                    {
                        System.out.println("Please enter correct id and pw.");
                    }
                    break;
                case 5:
                    System.out.println("\nDo you want to really exit?\nY for remain and N for exit: ");
                    des1 = sc.next();
                    break;
                default:
                    System.out.println("Please choose correct option from the menu:");
            }

            //System.out.println("\nDo you want to remain in system or exit?\nY for remain and N for exit: ");
            //des1 = sc.next();
        }


    sc.close();
    }
}
