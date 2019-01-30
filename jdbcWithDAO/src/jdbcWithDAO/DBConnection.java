package jdbcWithDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection con;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "7458");
		} catch (Exception e) {
			System.out.println(e);
		}
		return this.con;
	}

	public void closeConnection() {

		if (this.con != null) {
			try {
				this.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
