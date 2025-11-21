// Input : 6
// Output : 

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for (iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

class program161
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequence : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }
}