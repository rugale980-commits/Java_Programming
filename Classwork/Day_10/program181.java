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
        char ch = '\0';

        for (iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for (jCnt = 1, ch = 'a'; jCnt <= iCol; jCnt++,ch++)
            {
                System.out.print(ch+"\t");
            } 
            System.out.println(); 
        }
    }
}

class program181
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