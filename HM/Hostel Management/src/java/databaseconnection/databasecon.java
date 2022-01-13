package databaseconnection;
import java.sql.*;

public class databasecon 
{
	static Connection co;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			String dbUrl= System.getenv("JDBC_DATABASE_URL"); 
			
			Class.forName("com.mysql.jdbc.Driver");	
			co = DriverManager.getConnection(dburl); 
                
                
		catch(Exception e)
		{
			System.out.println("Database Error"+e);
		}
		return co;
	}
	
}
