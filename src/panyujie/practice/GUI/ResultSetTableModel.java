package panyujie.practice.GUI;
import java.sql.*;  
import javax.swing.table.*; 
 
/** 
   This class is the superclass for the scrolling and the
   caching result set table model. It stores the result set
   and its metadata.
*/
public class ResultSetTableModel extends AbstractTableModel{   
   private ResultSet rs;
   private ResultSetMetaData rsmd;  
   
   public ResultSetTableModel(ResultSet aResultSet) throws SQLException{  
      rs = aResultSet;    
     rsmd = rs.getMetaData(); 
   }
 
 public String getColumnName(int c){    
      try {    
      return   rsmd.getColumnName(c+1);
      } catch (SQLException e) { return "";  }       
   } 
 
  public int getColumnCount() {         
      try { return rsmd.getColumnCount();       
      } catch (SQLException e) {  return 0; }
   } 
    
   public Object getValueAt(int r,  int c) {  
       try{ 
           rs.absolute(r + 1);  
           return rs.getObject(c + 1);       
       } catch(SQLException e)  {  return null;  }
   }

   public int getRowCount() {    
        try {
            if (rs.last()) return rs.getRow();
            else return 0;        
        } catch(SQLException e) { return 0;  }
   } 
}

   