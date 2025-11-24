/*
    iRow : 4
    iCol : 4

    Diagonal Pattern :
    *       #       #       #
    *       *       #       #
    *       *       *       #
    *       *       *       *
    
*/

import java.util.Scanner;

class Pattern
{
    // Filter fo squre matrix
    public void Display(int iRow,int iCol)
    {
        int iCnt = 0;
        int jCnt = 0;

        if (iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and column number should be same");
            return ;
        }

        for (iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for (jCnt = 1; jCnt <= iCol; jCnt++)
            {
                if ((iCnt > jCnt))
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
                
            } 
            System.out.println(); 
        }
    }
}

class program190
{
    public static void main(String A[])
    {
        int iValue1 = 0; 
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}