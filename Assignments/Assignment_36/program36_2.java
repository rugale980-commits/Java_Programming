import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Pattern
//  Method Name   : public void struprx
//  Description   : Accept String from user & convert it into upper case.
//  Input         : Character
//  Output        : Character
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

public class Pattern
{
    public String strlwrx(String str)
    {
        char arr[] = str.toCharArray();
        int iCnt = 0;

        for (iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if ((arr[iCnt] >= 'a') && (arr[iCnt] <= 'z'))
            {
                arr[iCnt] = (char)(arr[iCnt] - 32);
            }
        }
        return new String(arr);
    }   

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program36_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();
        String ret = pobj.strlwrx(str);

        System.out.println("Modified String is : " + ret);

        sobj.close();
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Marvellous Multi OS
//  Ouptput : MARVELLOUS MULTI OS
//
////////////////////////////////////////////////////////////////////////////////