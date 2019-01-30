package jdbcWithDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonDAOImpl extends DBConnection implements PersonDAO {
	public Person getPerson(int id) {

		// if not extending
		// DBConnection dbCon = new DBConnection();
		// Connection con = dbCon.getConnection();
		Person p = new Person(id);
		Connection con = null;
		try {
			con = getConnection();
			String query = "select pName from person where Id=" + id;

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				String name = rs.getString(1);
				p.setpName(name);
			}
			rs.close();
			st.close();
			closeConnection();

		} catch (Exception e) {
			System.out.println("Exception occured " + e);
		}
		return p;
	}

	public int addPerson(Person p) {
		int count = 0;
		String query = "insert into person values (?,?)";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, p.getId());
			pst.setString(2, p.getpName());
			count = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return count;
	}
}
