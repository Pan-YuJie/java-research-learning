package panyujie.practice.GUI;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import panyujie.practice.GUI.DBConnection;

public class ResultSetFrame extends JFrame{    
   public ResultSetFrame() throws Exception {   
        Connection conn =DBConnection.getDBConnection();
        ResultSet rs=DBConnection.queryResultSet(conn);
        
        ResultSetTableModel model = new ResultSetTableModel(rs); 
        JTable table = new JTable(model); 
        JScrollPane scrollPane = new JScrollPane(table);         
        this.add(scrollPane, BorderLayout.CENTER);  
        	
        this.setTitle("��ѯ���");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        this.setVisible(true); 	 
    }       
}
 