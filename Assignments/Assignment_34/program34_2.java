////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public void Display
//  Description   : Acceot character from user. IF character is small display its
//                  corresponding capital character and in other case display as its.
//  Input         : Character
//  Output        : Character
//  Author        : Rahul Balasaheb Ugale
//  Date          : 28/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public void Display(char chDiv)
    {
        if (chDiv >= 'A' && chDiv <= 'Z') 
        {      
            chDiv = (char)(chDiv + 32);
            System.out.println(chDiv);
        }
        else if (chDiv >= 'a' && chDiv <= 'z')  
        {
            chDiv = (char)(chDiv - 32);
            System.out.println(chDiv);
        }
        else                                    
        {
            System.out.println(chDiv);
        }   
    }    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program34_2
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        pobj.Display(cValue);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : Q
//  Output : q
//
//  Input  : m
//  Output : M
//
//  Input  : 4
//  Output : 4
//
//  Input  : %
//  Output : %
//
////////////////////////////////////////////////////////////////////////////////