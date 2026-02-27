// Assignment 74 = 5nd Questions

import java.util.*;

class program800
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;

        float DiscountAmount = 0.0f;
        float FinalAmount = 0.0f;

        String Membership_Type = null;

        System.out.println("Enter purchase amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter type of Membership : (Premium/Regular)");
        Membership_Type = sobj.next();

        if
        ( 
            (Amount < 0) || 
            ((Membership_Type.equalsIgnoreCase("Premium") == false) &&
            (Membership_Type.equalsIgnoreCase("Regular") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Amount > 5000)  // 20 %
        {
            DiscountAmount = Amount * 0.2f;
        }
        else if (Amount > 2000) // 10 %
        {
            DiscountAmount = Amount * 0.1f;
        }
        else                // 0 %
        {
            DiscountAmount = 0.0f;
        }

        FinalAmount = Amount - DiscountAmount;

        if(Membership_Type.equalsIgnoreCase("Premium"))
        {
            DiscountAmount = DiscountAmount + (FinalAmount * 0.05f);
            FinalAmount = Amount - DiscountAmount;

        }

        System.out.println("Original Amount : Rs "+Amount);
        System.out.println("Total Discount : Rs "+DiscountAmount);
        System.out.println("Final Payable Amount : Rs "+FinalAmount);

        sobj.close();
    }
}