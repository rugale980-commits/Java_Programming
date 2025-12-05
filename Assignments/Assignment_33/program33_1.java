////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int ChkAlpha
//  Description   : Accept Character from user and check whether it is aplhabet
//                  or not (A-Z a-z)
//  Input         : Character
//  Output        : Character
//  Author        : Rahul Balasaheb Ugale
//  Date          : 28/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public static final int TRUE = 1;
    public static final int FALSE = 0;
    
    public int ChkAlpha(char chDiv)
    {
        if ((chDiv >= 'A') && (chDiv <= 'Z') || (chDiv >= 'a') && (chDiv <= 'z'))
        {
            return TRUE;
        }
        else
        {
            return FALSE;
        }
        
    }    

} // End of function

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program33_1
{
    public static void main(String A[])
    {
        char cValue = '\0';
        int bRet = Pattern.FALSE;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        bRet = pobj.ChkAlpha(cValue);

        if (bRet == Pattern.TRUE)
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not Character");
        }

    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : R
//  Output : It is Character
//
//  Input  : 123
//  Output : It is not Character
//
////////////////////////////////////////////////////////////////////////////////