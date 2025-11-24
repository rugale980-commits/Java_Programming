/*
    iRow : 4
    iCol : 4

    a       b       c       d
    a       b       c       d
    a       b       c       d
    a       b       c       d
    
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int iCnt = 0;
        int jCnt = 0;
        char ch = 'a';

        for (iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for (jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.printf("%c\t",ch);
                ch++;  // Important (to reset)
            } 
            System.out.println(); 
        }
    }
}

class program179
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