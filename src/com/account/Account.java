package com.account;

public class Account {

    private int accId;
    private double accBal;
    private String accType, accpw;


    public Account(int accId, double accBal, String accType, String accpw) {
        this.accBal = accBal;
        this.accId = accId;
        this.accType = accType;
        this.accpw = accpw;
    }

    Account(){} // default constructor

    public int deposit(double amt, int id, String pw)
    {
        if(id == accId && pw.equals(accpw))
        {
            accBal = accBal + amt;
            System.out.println("Your account has been credited with " + amt);
            System.out.println("Your new balance is " + getBalance());
            return 1;
        }

        return 0;
    }

    public int withdraw(double amt, int id, String pw)
    {
        if(id == accId && pw.equals(accpw))
        {
            if(amt <= accBal) {
                accBal = accBal - amt;
                System.out.println("Your account has been debited with " + amt);
                System.out.println("Your new balance is " + getBalance());
                return 1;
            }
            else {
                System.out.println("Not sufficient balance in your account.");
                return 1;
            }
        }

        return 0;
    }

    public double getBalance()
    {
        return accBal;
    }

    public int display(int id, String pw) {

        if (id == accId && pw.equals(accpw)) {
            System.out.println("Account id: " + accId);
            System.out.println("Account type: " + accType);
            System.out.println("Account balance: " + accBal);
            System.out.println("Account pw:" + accpw);
            return 1;
        }
        return 0;
    }
}
