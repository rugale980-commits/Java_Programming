import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : ChkIdentity
//  Description   : Write a program which accept matrix and check whether the 
//                  matrix Sparse matrix or not.
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

    public boolean ChkSparse()
    {
        int i = 0,j = 0;
        int iZero = 0, iNonZero = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZero++;
                }
                else
                {
                   iNonZero++;
                }
            }
        }

        if(iZero > iNonZero)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program73_5
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        System.out.println("Original Matrix :");
        mobj.Display();

        if(mobj.ChkSparse())
        {
            System.out.println("Matrix is Sparse Matrix");
        }
        else
        {
            System.out.println("Matrix is NOT Sparse Matrix");
        }
                
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input   :  Original Matrix :
//              1       0       0       0
//              0       6       0       0
//              0       0       1       0
//              9       0       0       9
//
//  Output   : Matrix is Sparse Matrix
//
////////////////////////////////////////////////////////////////////////////////