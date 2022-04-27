package panyujie.practice.jdbcclient;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.sql.*;

/**
 * This program shows how to display the result of a
 * database query in a table.
 */
@SuppressWarnings("serial")
public class ResultSetFrame extends JFrame {
    private JScrollPane scrollPane;
    private ResultSetTableModel model;
    private ResultSet rs;
    private Connection conn;
    private Statement stat;

    public ResultSetFrame(String sql) throws Exception {
        setTitle("余额显示");
        conn = DBConnection.getDBConnection();
        stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stat.executeQuery(sql);

        model = new ResultSetTableModel(rs);
        JTable table = new JTable(model);
        scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void displayGUI(String sql) throws Exception {
        JFrame frame = new ResultSetFrame(sql);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


/**
 * This class is the superclass for the scrolling and the
 * caching result set table model. It stores the result set
 * and its metadata.
 */
@SuppressWarnings("serial")
class ResultSetTableModel extends AbstractTableModel {
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public ResultSetTableModel(ResultSet aResultSet) throws SQLException {
        rs = aResultSet;
        rsmd = rs.getMetaData();
    }

    public String getColumnName(int c) {
        try {
            return rsmd.getColumnName(c + 1);
        } catch (SQLException e) {
            return "";
        }
    }

    public int getColumnCount() {
        try {
            return rsmd.getColumnCount();
        } catch (SQLException e) {
            return 0;
        }
    }

    public Object getValueAt(int r, int c) {
        try {
            rs.absolute(r + 1);
            return rs.getObject(c + 1);
        } catch (SQLException e) {
            return null;
        }
    }

    public int getRowCount() {
        try {
            if (rs.last()) return rs.getRow();
            else return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
}