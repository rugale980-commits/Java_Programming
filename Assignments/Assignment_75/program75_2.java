import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Credit_Score = 0;

        double Monthly_Income = 0;

        String Unpaid_Loan = null;

        System.out.println("Enter Your Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter Your Monthly Income : ");
        Monthly_Income = sobj.nextInt();

        System.out.println("Enter Your Credit Score : ");
        Credit_Score = sobj.nextInt();

        System.out.print("Existing Unpaid Loan (Yes/No): ");
        Unpaid_Loan = sobj.next();

        if(Age < 0 || Monthly_Income < 0 || Credit_Score < 0)
        {
            System.out.println("Age/income/score must be non-negative");
            return;
        }   
        
        if((Unpaid_Loan.equalsIgnoreCase("Yes") == false && Unpaid_Loan.equalsIgnoreCase("No") == false))        
        {
            System.out.println("Invalid Input: Existing unpaid loan must be Yes or No");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if(Monthly_Income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income must be at least ₹25000");
        }
        else if(Credit_Score < 700)
        {
            System.out.println("Loan Rejected: Credit score must be at least 700");
        }
        else if(Unpaid_Loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan detected");
        }
        else
        {
            System.out.println("Loan Approved");
        }
        
        
        sobj.close();
    }
}