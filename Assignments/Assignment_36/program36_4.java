import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Pattern
//  Method Name   : public void Display
//  Description   : Accept String from user & display only digit from that string.
//  Input         : Character
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

public class Pattern
{
    public String Display(String str)
    {
        char arr[] = str.toCharArray();
        char result[] = new char[arr.length];
        int iCnt = 0;
        int j = 0;

        for (iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if (arr[iCnt] >= '0' && arr[iCnt] <= '9')
            {
                result[j] = arr[iCnt];
                j++;
            }
        }
        return new String(result, 0, j);
    }   

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program36_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();
        String ret = pobj.Display(str);

        System.out.println("Modified String is : " + ret);

        sobj.close();
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Marve89llous121
//  Ouptput : 89121
//
////////////////////////////////////////////////////////////////////////////////