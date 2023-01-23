package FileIO;
import java.io.File;
 
public class FileSubdirectory
{
    public static void main(String[] args)
    {
        File folder = new File("d:/2021");
 
        File[] files = folder.listFiles();
 
        for (File file : files)
        {
            if (file.isDirectory())
            {
                System.out.println(file.getName());
            }
        }
    }
}
