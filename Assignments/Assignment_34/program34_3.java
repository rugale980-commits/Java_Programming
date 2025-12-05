////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public void Display
//  Description   : Acceot character from user. IF character is small display all
//                  character from the input character till Z. in same small reverse order.
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
            for (char c = chDiv; c <= 'Z'; c++)
            {
                System.out.println(c);
            }
        }
        else if (chDiv >= 'a' && chDiv <= 'z')  
        {
            for (char c = chDiv; c <= 'a'; c--)
            {
                System.out.println(c);
            }
        }
        else
        {} 
    }    
} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program34_3
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
//  Output : Q  R   S   T   U   V   W   X   Y   Z
//
//  Input  : m
//  Output : m  l   k   j   i   h   g   f   e   d   c   b   a
//
//  Input  : 8
//  Output :
//
////////////////////////////////////////////////////////////////////////////////