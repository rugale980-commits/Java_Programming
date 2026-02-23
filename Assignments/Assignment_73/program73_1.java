import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : TransPose
//  Description   : Write a program which accept matrix from user and display 
//                  TransPose of the matrix.
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

    public void TransPose()
    {
        int i = 0,j = 0;

        System.out.println("Transpose of matrix is : ");

        for(i = 0;i < iCol; i++)
        {
            for(j = 0;j < iRow; j++)
            {
                System.out.print(Arr[j][i]+"\t");
            }

            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program73_1
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        System.out.println("Original Matrix :");
        mobj.Display();

        mobj.TransPose();
        
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   :  Original Matrix :
//              3       2       5       9
//              4       3       2       2
//              8       4       1       9
//              3       9       7       5
//
//  Output   : Transpose of matrix is :
//              3       4       8       3
//              2       3       4       9
//              5       2       1       7
//              9       2       5       5
//
////////////////////////////////////////////////////////////////////////////////