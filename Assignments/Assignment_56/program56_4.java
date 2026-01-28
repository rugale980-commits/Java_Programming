import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class program56_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String Name = sobj.nextLine();

        Path p = Paths.get(Name);

        boolean isExist = false;

        if(Files.exists(p))
        {
            isExist = true;
        }

        if(isExist == false)
        {
            try
            {
                Files.createFile(p);
                System.out.println("File created successfully");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("File already exist");
        }
    }
}