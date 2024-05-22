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
    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      try (Statement stmt = conn.createStatement()) {
        // SQL 작업 수행
      } catch (SQLException e) {
        // Statement 관련 예외 처리
        e.printStackTrace();
      }
    } catch (SQLException e) {
      // Connection 관련 예외 처리
      e.printStackTrace();
    }
  }
}
