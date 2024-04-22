import java.io.*;

public class ResourceLeak {

  public void Test()
  {
    try {
      FileInputStream inputStream = new FileInputStream("file.txt");
    } catch (IOException e) {
      // inputStream을 close()하지 않음
      e.printStackTrace();
    }
    
  }
  
}
