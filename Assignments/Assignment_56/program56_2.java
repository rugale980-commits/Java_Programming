import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class program56_2
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

        p = Paths.get(Name);
        
        try(
        BufferedReader bobj = Files.newBufferedReader(p))
        {
            String line = null;
            boolean isEmpty = true;

            while((line = bobj.readLine()) != null)
            {
                isEmpty = false;
                System.out.println("Data is File is: " + line);
            }

            if(isEmpty)
            {
                System.out.println("Nothing in file");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        sobj.close();
    }
}