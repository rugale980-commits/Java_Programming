////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description   : Accept N number from user & display pattren.
//  Input         : Charcter
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 22/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int iCnt = 0;
        int jCnt = 0;
        int iNo = 0;

        for (iCnt = 1; iCnt <= iRow; iCnt++)
        {
            if (iCnt % 2 == 0)
            {
                iNo = 1;
            }
            else
            {
                iNo = 2;
            }

            for (jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.print(iNo+"\t");
                iNo += 2;
            }
            System.out.printf("\n");
        }
} // End of function
}
////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program29_2
{
    public static void main(String A[])
    {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : iRow = 4 , iCol = 5 :
//
//  Output :2       4       6       8       10
//          1       3       5       7       9
//          2       4       6       8       10
//          1       3       5       7       9
//
////////////////////////////////////////////////////////////////////////////////