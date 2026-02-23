import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    : Matrix
//  Method Name   : AddColumn
//  Description   : Write a program which accept matrix and Display addition of
//                  element from each column.
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

    public void AddColumn()
    {
        int i = 0,j = 0;
        int iSum = 0;

        System.out.println("Addition of each column : ");

        for(j = 0;j < iCol;j++)
        {
            iSum = 0;

            for(i = 0;i < iRow;i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println(iSum);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Main Entry point Class for the application
//
////////////////////////////////////////////////////////////////////////////////

class program72_4
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        mobj.AddColumn();
        
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
//  Output  : Addition of each column :
//            18
//            18
//            15
//            25
//
////////////////////////////////////////////////////////////////////////////////