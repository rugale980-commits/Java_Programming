/*
    input : 5
    output : A       B       C       D       E
    Index  : 1       2       3       4       5
    ASCII  : 65      66      67      68      69
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        // int i = 96;
        char ch = 'A';

        for (iCnt = 1; iCnt <= iNo; iCnt++, ch++)
        {
           System.out.printf("%c\n",ch);  
        }
        System.out.println(); 
    }
}

class program176
{
    public static void main(String A[])
    {
        int iValue = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequence : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }
}