////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public void Reversel
//  Description   : Accept String from user & Display it in reverse order.
//  Input         : Character
//  Output        : Input
//  Author        : Rahul Balasaheb Ugale
//  Date          : 29/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public String Reverse(String str)
    {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        char temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
        
    }     

} // End of Method

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point application
//
////////////////////////////////////////////////////////////////////////////////

public class program35_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();     

        Pattern pobj = new Pattern();

        String rev = pobj.Reverse(str);

        System.out.println("Reverse String : " + rev);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : marvellous
//  Ouptput : suollevraM
//
////////////////////////////////////////////////////////////////////////////////