import java.io.*;

public class ResourceLeak {

  public void Test()
  {
    FileInputStream inputStream = null;
    try {
      inputStream = new FileInputStream("file.txt");
    } catch (IOException e) {
      // inputStream을 close()하지 않음
      e.printStackTrace();
    } finally {  
      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException e) {
        //silence.
      }
    }
  }
  
}
