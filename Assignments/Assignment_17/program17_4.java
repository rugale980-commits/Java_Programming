////////////////////////////////////////////////////////////////////////////////
//
//  Method Name   : findMin (class logic)
//  Description   : program to find the maximum of three number
//  Input         : Integer
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 22/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class logic 
{
    void findMin(int iNo1 , int iNo2 , int iNo3)
    {
        int iMax = 0;

        if (iNo1 > iNo2)
        {
            iMax = iNo1;
        }
        else if (iNo2 > iNo3)
        {
            iMax = iNo2;
        }
        else
        {
            iMax = iNo3;
        }

        System.out.println("Maximum number is : "+iMax);
    }
} // End of Mathod

////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Method for the application
//
////////////////////////////////////////////////////////////////////////////////

class program17_4
{
    public static void main(String A[])
    {
        logic obj = new logic();
        obj.findMin(3,7,2);
    }
} // End of main class

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 3 , 7 , 2
//  Output : Maximum number is : 7
//
////////////////////////////////////////////////////////////////////////////////