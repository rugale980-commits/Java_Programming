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
            iNo = iCnt;
            
            for (jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.print(iNo+"\t");
                iNo++;
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

public class program29_5
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
//           2       3       4       5       6
//           3       4       5       6       7
//           4       5       6       7       8
//           5       6       7       8       9     
//
////////////////////////////////////////////////////////////////////////////////