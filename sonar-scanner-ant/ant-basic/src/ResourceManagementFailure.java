import java.sql.*;
import java.io.*;

public class ResourceManagementFailure {
  String url = "";
  String user = "user";
  String password = "password";
  
  public void test()
  {
    try {
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
    } catch(IOException e) {
      // Connection 또는 Statement가 적절히 close()되지 않음
      e.printStackTrace();
    }
  }
}
