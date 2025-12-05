////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int ChkVowel
//  Description   : Accept String from user & check whether it cintain vowel or not.
//  Input         : Character
//  Output        : Input
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public boolean ChkVowel(String str)
    {
        int iCnt = 0;

        for (iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char ch = str.charAt(iCnt);

            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                return true;  
            }
        }
        return false;  
    }     

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program35_4
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();

        bRet = pobj.ChkVowel(str);

        if (bRet == true)
        {
            System.out.println("Contains Vowel");
        }
        else
        {
            System.out.println("There is no Vowel");
        }
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : marvellous
//  Ouptput : Contains Vowel
//
//  Input   : Demo
//  Ouptput : Contains Vowel
//
//  Input   : xyz
//  Ouptput : There is no Vowel
//
////////////////////////////////////////////////////////////////////////////////