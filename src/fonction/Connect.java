package fonction;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public Connection getPostgreConnection() throws Exception
    {
    Connection conn = null;
    try
    {
      
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection(
      "jdbc:postgresql://localhost:5432/hopital","postgres","mendrikaja");
      
    }
    catch(Exception e){ 
      System.out.println(e);
    }
    return conn;
    }
}
