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
        char ch = 'A';

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%c\t", ch);
            ch++;
        }
} // End of function
}
////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program26_1
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
//  Output : A  B   C   D   E
//
//  Input  : 7
//  Output : A  B  C  D  E  F  G
//
////////////////////////////////////////////////////////////////////////////////