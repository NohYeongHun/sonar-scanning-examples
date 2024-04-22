import java.io.*;

public class ResourceLeak {

  public void Test()
  {
    try {
      FileInputStream inputStream = new FileInputStream("file.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
}
