import java.nio.file.*;
import java.util.Scanner;

class program57_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String dirName = null;

        System.out.println("Enter directory name:  ");
        dirName = sobj.nextLine();

        Path path = Paths.get(dirName);

        try
        {
            Files.createDirectories(path);
            System.out.println("Directory created successfully : "+path.toAbsolutePath());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}