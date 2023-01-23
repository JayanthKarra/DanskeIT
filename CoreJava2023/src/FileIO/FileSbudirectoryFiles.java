package FileIO;
import java.io.File;
 
public class FileSbudirectoryFiles
{
    private static void listFiles(String path)
    {
        File folder = new File(path);
 
        File[] files = folder.listFiles();
 
        for (File file : files)
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
            }
        }
    }
 
    public static void main(String[] args)
    {
        listFiles("D:/2021");
    }
}