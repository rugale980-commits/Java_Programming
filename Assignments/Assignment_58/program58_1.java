import java.io.File;

class program58_1
{
    public static void main(String A[])
    {
        String Path = "C:\Users\gbuga\OneDrive\Desktop\LB Assignment\Assignment_56>";

        File dir = new File(Path);

        File[] files = dir.listFiles();

        if(files != null)
        {
            for(File file : files)
            {
                System.out.println(file.getName());
            }
        }
    }
}
