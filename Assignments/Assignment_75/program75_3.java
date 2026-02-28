import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       int Current_Stock = 0;
       int Requ_Quantity = 0;

       System.out.println("Enter the Current stock :");
       Current_Stock  = sobj.nextInt();

       System.out.println("Enter the number of Requested quantity :");
       Requ_Quantity = sobj.nextInt();
        
       if(Current_Stock < 0)
       {
           System.out.println("Stock cannot be negative");
           return;
       }
       else if(Requ_Quantity < 0)
       {
           System.out.println("Requested quantity must be > 0");
           return;
       }
        
       if(Requ_Quantity > Current_Stock)
       {
           System.out.println("Order Failed: Insufficient Stock.");
           return;
       }
       else
       {
            System.out.println("Order Processed Successfully.");
            Current_Stock = Current_Stock - Requ_Quantity;
            System.out.println("Remaining Stock : "+Current_Stock);
       }

       if(Current_Stock <= 5)
       {
            System.out.println("Low Stock Alert!");
       }

        sobj.close();
    }
}