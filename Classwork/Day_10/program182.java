/*
    iRow : 4
    iCol : 4

    a       b       c       d
    1       2       3       4
    a       b       c       d
    1       2       3       4
    
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
                if ((iCnt % 2) == 0)
                {
                    System.out.print(jCnt+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
                
            } 
            System.out.println(); 
        }
    }
}

class program182
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