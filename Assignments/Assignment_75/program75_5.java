import java.util.*;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       int Annual_Income = 0;
       double Tax_Payable = 0;

       System.out.println("Enter Your Annual Income : ");
       Annual_Income = sobj.nextInt();

       if(Annual_Income < 0)
       {
            System.out.println("Income cannot be negative");
            return;
       }

       if(Annual_Income <= 250000)
       {
            Tax_Payable = 0;
       }
       else if(Annual_Income <= 500000)
       {
            Tax_Payable = (Annual_Income - 250000) * 0.05;
       }
       else if(Annual_Income <= 1000000)
       {
            Tax_Payable = (Annual_Income - 250000) * 0.20;
       }
       else
       {
            Tax_Payable = (250000 * 0.05) + 
                          (500000 * 0.20) + 
                          (Annual_Income - 1000000) * 0.30;
       }

       System.out.println("Annual Income : "+Annual_Income);
       System.out.println("Total Tax Payable : "+Tax_Payable);

        sobj.close();
    }
}