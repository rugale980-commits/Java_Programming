////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int CountCapital
//  Description   : Accept String from user and count number of capital character.
//  Input         : Character
//  Output        : Input
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public int CountCapital(String str)
    {
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char ch = str.charAt(iCnt);

            if ((ch >= 'A') && (ch <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }    

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program35_1
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();

        iRet = pobj.CountCapital(str);

        System.out.println(iRet);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Marvellous Multi OS
//  Ouptput : 4
//
////////////////////////////////////////////////////////////////////////////////