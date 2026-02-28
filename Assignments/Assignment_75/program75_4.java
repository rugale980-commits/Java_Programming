import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine_Amount = 0;

        String Helmet = null;
        String License = null;
        String OverSpeeding = null;

        System.out.println("Helmet worn : (Yes/No)");
        Helmet = sobj.next();

        System.out.println("License available : (Yes/No)");
        License = sobj.next();
        
        System.out.println("Overspeeding  : (Yes/No)");
        OverSpeeding = sobj.next();

        if
        (
           !(Helmet.equalsIgnoreCase("Yes") || Helmet.equalsIgnoreCase("No")) ||
           !(License.equalsIgnoreCase("Yes") || License.equalsIgnoreCase("No")) ||
           !(OverSpeeding.equalsIgnoreCase("Yes") || OverSpeeding.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid Input : Enter Yes or No only");
            return;
        }


        if(Helmet.equalsIgnoreCase("No"))
        {
            Fine_Amount = 500;
        }

        if(License.equalsIgnoreCase("No"))
        {
            Fine_Amount = 1000;
        }

        if(OverSpeeding.equalsIgnoreCase("Yes"))
        {
            Fine_Amount = 1500;
        }

        if
        (
            Helmet.equalsIgnoreCase("No") &&
            License.equalsIgnoreCase("No") &&
            OverSpeeding.equalsIgnoreCase("Yes")
        )
        {
            Fine_Amount = 3000;
        }

        System.out.println("Total Fine Amount : "+Fine_Amount);


        sobj.close();
    }
}