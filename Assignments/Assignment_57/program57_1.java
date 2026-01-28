
import java.util.Scanner;
import java.nio.file.*;

class program57_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String src = null;
        String dest = null;

        System.out.println("Enter source file name: ");
        src = sobj.nextLine();

        System.out.println("Enter destination file name: ");
        dest = sobj.nextLine();

        Path srcFile = Paths.get(src);
        Path destFile = Paths.get(dest);

        try
        {
            Files.createFile(destFile);
            Files.copy(srcFile, destFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
