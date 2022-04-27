package panyujie.practice.Swing;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DBConnection {
	Connection con=null;
	String driver = "";
	String url = "";
	String name = "";
	String passwd = "";

	public DBConnection() {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/panyujie/practice/Swing/logon_initial.properties"));
			driver = prop.getProperty("drivers");
			url = prop.getProperty("url");
			name = prop.getProperty("username");
			passwd= prop.getProperty("password");
			Class.forName(driver);
			con = DriverManager.getConnection(url,name,passwd);
		} catch (ClassNotFoundException e) {
			System.out.println("对不起，找不到这个Driver");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 对用户信息的修改实际上就是对密码的修改
	public boolean update(String username1, String password1, String newpassword) {
		boolean flag = false;
		boolean s = compare(username1, password1);
		if (s) {
			String sql = "update login_DB set password= ? where username= ?";
			try {
				PreparedStatement statement= con.prepareStatement(sql);
				statement.setString(1,newpassword);
				statement.setString(2,username1);
				int a = statement.executeUpdate();
				statement.executeUpdate("commit");
				if (a == 1) {
					JOptionPane.showMessageDialog(null, "密码修改成功！");
					flag = true;
				}
				con.close();
				statement.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "用户不存在！");
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "修改失败");
		}
		return flag;
	}

	// 删除用户信息
	public void delete(String username, String password) {
		if (compare(username, password)) {
			JOptionPane.showMessageDialog(null, "已经完成删除");
		} else {
			return;
		}
		String sql = "delete from login_DB where username= ? ";
		try {
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,username);
			int a = statement.executeUpdate();
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "删除成功！");
			}
			statement.executeUpdate("commit");
			con.close();
			statement.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "不存在该用户！");
			e.printStackTrace();
		}

	}

	// 用户注册功能的实现，添加数据
	public void insert(String username, String password) {
		String sql = "insert into login_DB(username,password) values (? , ?)";
		try {
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,username);
			statement.setString(2,password);
			int a = statement.executeUpdate();
			statement.executeUpdate("commit");
			con.close();
			statement.close();
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "注册成功！");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "该用户名已经有了！");
			e.printStackTrace();
		}
	}

	// 对比用户名和密码是不匹配
	public boolean compare(String username, String password) {
		boolean flag = false;
		String sql = "select password from login_DB where username= ?" ;
		try {
			PreparedStatement statement= con.prepareStatement(sql);
			statement.setString(1,username);
			ResultSet res = statement.executeQuery();

			if (res.next()) {
				String pass = res.getString(1);
				System.out.println(pass + " " + password);
				if (pass.equals(password)) {
					flag = true;
				} else {
					JOptionPane.showMessageDialog(null, "密码错误！");
				}
			} else {
				JOptionPane.showMessageDialog(null, "用户名不存在！");
			}
			res.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
