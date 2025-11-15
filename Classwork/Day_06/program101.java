import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program101
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;        

        System.out.println("Enter the size of array :");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the element : ");

        for(iCnt= 0;iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iRet = aobj.CountEven(Arr);
        System.out.println("Even elements are : "+iRet);

        // Important
        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}