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
            if (iCnt % 2 == 1)
            {
                iNo = 1;
            }
            else
            {
                iNo = -1;
            }

            for (jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.print( iNo+ "\t");

                if (iNo > 0)
                {
                    iNo++;
                }
                else
                {
                    iNo--;
                }
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

public class program29_4
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
//  Input  : iRow = 5 , iCol = 5 :
//
//  Output : 1       2       3       4       5
//          -1      -2      -3      -4      -5
//           1       2       3       4       5
//          -1      -2      -3      -4      -5
//           1       2       3       4       5     
//
////////////////////////////////////////////////////////////////////////////////