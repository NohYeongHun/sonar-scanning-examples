import java.sql.*;
import java.io.*;

public class ResourceManagementFailure {
  String url = "";
  String user = "user";
  String password = "password";
  
  public void test()
  { 
    Connection conn = null;
    Statement stmt = null;
    try {
      conn = DriverManager.getConnection(url, user, password);
      stmt = conn.createStatement();
    } catch(Exception e) {
      // Connection 또는 Statement가 적절히 close()되지 않음
      e.printStackTrace();
    } finally {
      try {
        if (conn != null)
        {
           conn.close();
        }

        if (stmt != null)
        {
           stmt.close();    
        }
      } catch (IOException e) {
        // silence
      }
    }
  }
}
