// Assignment 74 = 4nd Questions

import java.util.*;

class program799
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int UnitsConsumed = 0;
        int Amount = 0;

        System.out.println("Enter the units that are consumed : ");
        UnitsConsumed = sobj.nextInt();

        if(UnitsConsumed < 0)
        {
            System.out.println("Units cannot be negative");
            return;
        }

        if(UnitsConsumed <= 100 )
        {
            Amount = UnitsConsumed * 5;
        }
        else if(UnitsConsumed <= 200)
        {
            Amount = 500 + (UnitsConsumed - 100) * 7;
        }
        else if(UnitsConsumed > 200)
        {
            Amount = 500 + 700 +(UnitsConsumed - 200) * 10;
        }

        System.out.println("Total Units Consumed : "+UnitsConsumed);
        System.out.println("Total Electricity Bil : "+Amount);

        sobj.close();
    }
}