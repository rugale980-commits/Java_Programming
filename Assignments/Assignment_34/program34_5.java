////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public int ChkSpecial
//  Description   : Acceot character from user and display its ASCII value in
//                  decimal octal and hexadecimal format.
//  Input         : Character
//  Output        : Character
//  Author        : Rahul Balasaheb Ugale
//  Date          : 28/11/202
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public void ChkSpecial(char ch)
    {
        System.out.printf("Decimal      : %d%n", (int)ch);
        System.out.printf("Octal        : %o%n", (int)ch);
        System.out.printf("Hexadecimal  : 0X%X%n", (int)ch);
    }

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program34_5
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        pobj.ChkSpecial(cValue);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : A
//  Ouptput : Decimal 65
//            Octal 0101
//            Hexadecimal 0X41
//
////////////////////////////////////////////////////////////////////////////////