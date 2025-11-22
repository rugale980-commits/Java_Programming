////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description   : Accept N number from user & display pattren.
//  Input         : Charcter
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 20/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for (iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.printf(iCnt+"\t#\t");
        }
} // End of function
}
////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program26_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 5
//  Output : 5 # 4 # 3 # 2 # 1 #
//
//  Input  : 3
//  Output : 3 # 2 # 1 #
//
////////////////////////////////////////////////////////////////////////////////