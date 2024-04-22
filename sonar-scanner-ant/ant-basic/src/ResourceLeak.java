import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ResourceLeak {
   int data = 0;
   String path = "file.txt";
   try {
      FileInputStream fls = new FileInputStream(path);
      while((data = fis.read()) != -1) {
         System.out.write(data);
      }
   } catch (IOException e) {
      e.printStackTrace();
   }   
   
   
}
