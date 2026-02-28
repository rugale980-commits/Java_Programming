import java.util.*;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Parking_Hours = 0;
        int Parking_Fee = 0;

        System.out.println("Enter Total Parcking Hours : ");
        Parking_Hours = sobj.nextInt();

        if(Parking_Hours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        if(Parking_Hours <= 2)
        {
            Parking_Fee = 20;
        }
        else
        { 
            Parking_Fee = 20 + (Parking_Hours - 2) * 10;
        }
        
        if(Parking_Hours > 10)
        {
            Parking_Fee =  Parking_Fee + 50;
        }
        
        System.out.println("Total Parking Duration : "+Parking_Hours);
        System.out.println("Total Parking Fee : "+Parking_Fee);

        
        sobj.close();
    }
}