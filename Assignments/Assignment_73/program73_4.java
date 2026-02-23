import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : ChkIdentity
//  Description   : Write a program which accept matrix and check whether the 
//                  matrix identity matrix or not.
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

    public boolean ChkIdentity()
    {
        int i = 0,j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program73_4
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        System.out.println("Original Matrix :");
        mobj.Display();

        if(mobj.ChkIdentity())
        {
            System.out.println("Matrix is Identity Matrix");
        }
        else
        {
            System.out.println("Matrix is NOT Identity Matrix");
        }
                
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   :  Original Matrix :
//              1       0       0       0
//              0       1       0       0
//              0       0       1       0
//              0       0       0       1
//
//  Output   : Matrix is Identity Matrix
//
////////////////////////////////////////////////////////////////////////////////