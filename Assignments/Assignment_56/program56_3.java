import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;


class program56_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Name = null;

        System.out.println("Enter file name: ");
        Name = sobj.nextLine(); 

        try
        {
            FileWriter writer = new FileWriter(Name, true); // true means it is in append mode

            System.out.println("Data you want to add : ");
            String data = sobj.nextLine();

            writer.write(data);
            writer.close();

            System.out.println("Successfully written in file");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sobj.close();
    }
}