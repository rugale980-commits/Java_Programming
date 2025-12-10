import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Pattern
//  Method Name   : public void CountWhite
//  Description   : Accept String from user & Count number of white spaces.
//  Input         : Character
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

public class Pattern
{
    public int CountWhite(String str)
    {
        char arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if (arr[iCnt] == ' ')
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

public class program36_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();
        int iRet = pobj.CountWhite(str);

        System.out.println("Modified String is : " + iRet);

        sobj.close();
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Marvellous
//  Ouptput : 0
//
//  Input   : Marvellous Infosystem
//  Ouptput : 1
//
////////////////////////////////////////////////////////////////////////////////