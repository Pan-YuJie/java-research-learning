package panyujie.practice.jdbcclient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountTransfer{     
     public static void accountTransfer(String fromAno, String toAno, int amount,Connection connection) throws Exception{  
    	 
    	 Statement statement=connection.createStatement(); 
    	 ResultSet resultset;
    	 
    	 resultset = statement.executeQuery("select balance from account where ano = " + fromAno);   
		 if(resultset==null) {
			 System.out.println("没有账户");
			 return;
		 }
		 resultset.next();
		 int fromBalance = resultset.getInt("balance");
		 
		 resultset = statement.executeQuery("select balance from account where ano = " + toAno);
		 if(resultset==null) {
			 System.out.println("没有账户");
			 return;
		 }
		 resultset.next();
		 int toBalance = resultset.getInt("balance");
		 
		 if(fromBalance<amount) {
			 System.out.println("余额不足");
			 return;
		 } else {
			 fromBalance-=amount;
			 toBalance+=amount;
		 }
		 
		 statement.executeUpdate("update account set balance=" + fromBalance + " where ano='" + fromAno + "'");
		 statement.executeUpdate("update account set balance=" + toBalance + " where ano='" + toAno + "'");
		 statement.executeUpdate("commit");
		 System.out.println("转账成功");
		 return;
     } 
}
    
    