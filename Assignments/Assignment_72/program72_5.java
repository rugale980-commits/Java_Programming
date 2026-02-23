import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : SwapRows
//  Description   : Write a program which accept matrix and swap the contents of
//                  consecutive rows.
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

    public void SwapRows()
    {
        int i = 0,j = 0;
        int temp = 0;

        for(i = 0;i < iRow - 1;i = i + 2)
        {
            for(j = 0;j < iCol;j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = temp;
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program72_5
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        System.out.println("Matrix before swapping :");
        mobj.Display();

        mobj.SwapRows();

        System.out.println("Matrix after swapping consecutive rows :");
        mobj.Display();
        
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   : Matrix before swapping :
//            Element of matrix are :
//            3       2       5       9
//            4       3       2       2
//            8       4       1       9
//            3       9       7       5
//
//  Output   : Matrix after swapping consecutive rows :
//             Element of matrix are :
//              4       3       2       2
//              3       2       5       9
//              3       9       7       5
//              8       4       1       9
//
////////////////////////////////////////////////////////////////////////////////