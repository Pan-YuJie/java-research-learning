package panyujie.practice.GUI;
import java.io.*;
import java.util.*;
import java.sql.*;


public class DBConnection{
     public static Connection getDBConnection() throws Exception {
        	Properties prop = new Properties();
        	prop.load(new FileInputStream("src\\panyujie\\practice\\GUI\\logon_initial.properties"));
		    String drivers = prop.getProperty("drivers");
		    String url = prop.getProperty("url");
		    String username = prop.getProperty("username");
		    String password= prop.getProperty("password");  
		  
            Class.forName(drivers);
            Connection  conn = DriverManager.getConnection(url,username,password);
            return conn;
      }  


       public static ResultSet queryResultSet(Connection conn) throws Exception{
    	String sql = "SELECT * FROM S where age<?";
        PreparedStatement pstmt = conn.prepareStatement(
        	                                        sql,
                                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_READ_ONLY
                                              	);  
        int varAge=30;
        pstmt.setInt(1,varAge);
        ResultSet rs = pstmt.executeQuery();   
        return rs;
   }   	
   	
}


 
		 