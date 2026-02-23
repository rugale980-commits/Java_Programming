import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : AddDiagonal
//  Description   : Write a program which accept matrix and one number from user 
//                  and return frequency of that number.
//  Input         : Integer
//  Output        : Integer
//  Author        : Rahul Balasaheb Ugale
//  Date          : 22/02/2026
//
////////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
    public int iNo;
    public int Arr[][];


    public Matrix(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0,j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element matrix : ");

        for(i = 0;i < iRow;i++)
        {
            System.out.println("Enter the element of Row : "+(i + 1));

            for(j = 0;j < iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter the number check frequency : ");
        iNo = sobj.nextInt();
    }

    public void Display()
    {
        int i = 0,j = 0;

        System.out.println("Element of matrix are : ");

        for(i = 0;i < iRow;i++)
        {
            for(j = 0;j < iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

            System.out.println();
        }
    }

    public int Frequency()
    {
        int i = 0,j = 0;
        int iFreq = 0;

        for(i = 0;i < iRow;i++)
        {
            for(j = 0;j < iCol;j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iFreq++;
                }
            }
        }

        return iFreq;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program72_2
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Frequency is : "+mobj.Frequency());

        
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : 3       2       5       9
//            4       3       2       2
//            8       4       1       5
//            3       9       7       5
//              
//            Enter the number check frequency : 3
//
//  Output  : Frequency is : 3         
//
////////////////////////////////////////////////////////////////////////////////