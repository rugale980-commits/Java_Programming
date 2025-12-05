////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int Differences
//  Description   : Accept String from user and return Small & capital diffrence.
//  Input         : Character
//  Output        : Input
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public int Difference(String str)
    {
        int iCnt = 0;
        int iCount1 = 0;
        int iCount2 = 0;

        for (iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char ch = str.charAt(iCnt);

            if ((ch >= 'A') && (ch <= 'Z'))
            {
                iCount1++;
            }
            else if ((ch >= 'a') && (ch <= 'z'))
            {
                iCount2++;
            }
        }
        return (iCount1 - iCount2);
    }    

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program35_3
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();

        iRet = pobj.Difference(str);

        System.out.println(iRet);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : MarvellouS
//  Ouptput : 6 (8 - 2)
//
////////////////////////////////////////////////////////////////////////////////