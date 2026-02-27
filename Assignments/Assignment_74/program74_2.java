// Assignment 74 = 2nd Questions

import java.util.*;

class program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Current_Balance = 0;
        int Withdraw_Balance = 0;

        System.out.println("Please Enter your current balance : ");
        Current_Balance = sobj.nextInt();

        System.out.println("Please Enter the amount that you want to withdraw : ");
        Withdraw_Balance = sobj.nextInt();

        if(Current_Balance < 0 || Withdraw_Balance <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Withdraw_Balance % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal amount must be a multiple of Rs 100");
            return;
        }
        else if(Withdraw_Balance > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawal per transaction is Rs 25,000");
            return;
        }
        else if(Current_Balance - Withdraw_Balance < 1000)
        {
            System.out.println("Transaction Failed : After withdrawal, balance must be remain at least Rs 1,000");
        }
        else
        {
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance : Rs "+(Current_Balance - Withdraw_Balance));
        }

        sobj.close();

    }
}