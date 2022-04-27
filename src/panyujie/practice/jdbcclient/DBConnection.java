package panyujie.practice.jdbcclient;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getDBConnection() throws Exception {

//    	Properties properties = new Properties();
//    	properties.load(new FileReader("logon_initial.properties"));
//    	try {
//    		Class.forName(properties.getProperty("drivers"));
//    		return DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
//    	} catch(Exception e) {
//    		e.printStackTrace();
//    	}

		try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		return DriverManager.getConnection("jdbc:oracle:thin:@10.3.174.121:1521/orcl","system","pyj285464711");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
	} 
}
