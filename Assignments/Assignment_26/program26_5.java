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

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%d\t", (iCnt * 2));
        }
} // End of function
}
////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program26_5
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
//  Input  : 8
//  Output : 2       4       6       8       10      12      14      16
//
//  Input  : 4
//  Output : 2       4       6       8
//
////////////////////////////////////////////////////////////////////////////////