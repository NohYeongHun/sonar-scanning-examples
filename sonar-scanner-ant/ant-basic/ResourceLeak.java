import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ResourceLeak {
   try {
      FileInputStream inputStream = new FileInputStream("file.txt");
   } catch  (IOException e) {
      System.out.println(e);
   }
}
