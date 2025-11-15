///////////////////////////////////////////////////////////////
//
//  Function Name :  class Marvellous 
//  Description :    It is print Display "jay Ganesh" 4 times
//  Input :          Integer
//  Output :         Integer
//  Author :         Rahul Balasaheb Ugale
//  Date :           10/10/2025
//
///////////////////////////////////////////////////////////////

class Marvellous
{
    public void Display()
    {
       int iCnt = 0;  // Filter
       
        for(iCnt = 1;iCnt <= 4;iCnt++)
        {
           System.out.println("Gay Ganesh...");
        }
    }
}   // End of the class Marvellous

///////////////////////////////////////////////////////////////
// 
//  Entery point function for the application
//
///////////////////////////////////////////////////////////////

class program24
{

    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        
        mobj.Display();
    }
}   // End of the main function

///////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Output :
//     Gay Ganesh...
//     Gay Ganesh...
//     Gay Ganesh...
//     Gay Ganesh...
//
///////////////////////////////////////////////////////////////