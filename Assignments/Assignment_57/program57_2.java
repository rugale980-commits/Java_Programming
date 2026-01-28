import java.nio.file.*;
import java.util.Scanner;

class program56_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        System.out.println("Enter filename: ");
        FileName = sobj.nextLine();

        Path path = Paths.get(FileName);

        if(Files.isRegularFile(path))
        {
            System.out.println(path +" is a regular file");
        }
        else
        {
            System.out.println(path + " is not a regular file");
        }
    }
}