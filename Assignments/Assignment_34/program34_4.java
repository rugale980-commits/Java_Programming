////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int ChkSpecial
//  Description   : Acceot character from user and check whether it is special or not.
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
    
    public int ChkSpecial(char ch)
    {
        if (ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
            ch == '%' || ch == '^' || ch == '&' || ch == '*')
        {
            return TRUE;
        }
        else
        {
            return FALSE;
        } 
    }    

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program34_4
{
    public static void main(String A[])
    {
        char cValue = '\0';
        int bRet = Pattern.FALSE;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        bRet = pobj.ChkSpecial(cValue);

        if (bRet == Pattern.TRUE)
        {
            System.out.println("It is Special Character");
        }
        else
        {
            System.out.println("It is not a Special Character");
        }

    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Enter the Characte : #
//  Ouptput : It is Special Character
//
//  Input   : Enter the Characte : w
//  Ouptput : It is not a Special Character
//
////////////////////////////////////////////////////////////////////////////////