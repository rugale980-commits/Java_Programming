/*
    iRow : 3

    $       $       $       $
    $       $       $       $
    $       $       $       $

*/

import java.util.*;

class Pattern
{
    public void Display(int iRow)
    {
        int iCnt = 0;
        int jCnt = 0;

        for (iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for (jCnt = 1; jCnt <= iRow - iCnt; jCnt++)
            {
                System.out.print(" ");
            }

            for (jCnt = 1; jCnt <= 2 * iCnt -1; jCnt++)
            {
                System.out.print("*");
            }            
            System.out.println();
        }
    }
}

class program166
{
    public static void main(String A[])
    {
        int iValue1 = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        iValue1 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1);
    }
}