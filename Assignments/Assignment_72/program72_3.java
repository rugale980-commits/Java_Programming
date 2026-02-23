import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : MaxDiagonal
//  Description   : Write a program which accept matrix and return largest number
//                  from both the diagonal.
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

    public int MaxDiagonal()
    {
        int i = 0,j = 0;
        int iMax = Arr[0][0];

        for(i = 0;i < iRow;i++)
        {
            for(j = 0;j < iCol;j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }

        return iMax;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program72_3
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Largest number is : "+mobj.MaxDiagonal());

        
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
//  Output  : Largest number is : 9
//
////////////////////////////////////////////////////////////////////////////////