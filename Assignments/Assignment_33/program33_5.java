////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : public void DisplaySchedule
//  Description   : Accept division of student from user & depends on the division
//                  display Exam timing
//  Input         : Character
//  Output        : Character
//  Author        : Rahul Balasaheb Ugale
//  Date          : 28/11/2025
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Pattern
{
    public void DisplaySchedule(char chDiv)
    {
        switch (chDiv)
        {
            case 'A':
            case 'a':
                System.out.println("Your exam at 7 AM");
                break;

            case 'B':
            case 'b':
                System.out.println("Your exam at 8.30 AM");
                break;

            case 'C':
            case 'c':
                System.out.println("Your exam at 9.20 AM");
                break;

            case 'D':
            case 'd':
                System.out.println("Your exam at 10.30 AM");
                break;

            default:
            System.out.println("Invalid division");
        } 
    }             
} // End of function

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////

public class program33_5
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        pobj.DisplaySchedule(cValue);
    }

} // End of main

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : C
//  Output : Your exam at 9.20 Am
//
//  Input  : d
//  Output : Your exam at 10.30 AM
//
////////////////////////////////////////////////////////////////////////////////