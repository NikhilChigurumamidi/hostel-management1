package jdbc;


import java.net.URISyntaxException;

public class DButil {

Connection connection=null;

ResourceBundle db_parm;

public static Connection getConnection() throws URLSyntaxException, SQLException
{ String dbUrl= System.getenv("JDBC_DATABASE_URL"); 
return DriverManager.getConnection(dburl); 
}}