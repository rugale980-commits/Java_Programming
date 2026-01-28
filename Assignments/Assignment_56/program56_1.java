import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class program56_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Name = null;

        System.out.println("Enter file name: ");
        Name = sobj.nextLine(); 

        Path p = Paths.get(Name);

        try
        {
            Files.createFile(p);
            System.out.println("File succesfully created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}