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
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (stmt != null) {
        try { 
          stmt.close(); 
        } catch(Exception e) {
          // silence
        }
      }
      if (conn != null) {
        try { 
          conn.close(); 
        } catch(Exception e) {
          // silence
        }  
      }
    }
  }
}
