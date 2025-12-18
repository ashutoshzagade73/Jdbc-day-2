package preparestatementjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Studentdao {

	public void insertdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root",
				"root");
		System.out.println("Connection is OK...");

		PreparedStatement ps = c.prepareStatement("insert into studentclass (id, name, city) values ( ?,?,?)");
		ps.setInt(1, 4);
		ps.setString(2, "veer");
		ps.setString(3, "mumbai");

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data inserted successfully...");
		} else {
			System.err.println("Data is not inserted..");
		}

		c.close();
	}

	public void updatedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root",
				"root");
		System.out.println("Connection is OK...");

		String sql = "UPDATE studentclass SET city = ? WHERE id = 2";

		try (PreparedStatement ps = c.prepareStatement(sql)) {

			ps.setString(1, "NSK");

			int rowsAffected = ps.executeUpdate();

			System.out.println(rowsAffected + " row(s) updated.");

		}
		c.close();
	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root",
				"root");
		System.out.println("Connection is OK...");

		PreparedStatement ps = c.prepareStatement("delete from studentclass  WHERE id = ?");
		ps.setInt(1, 2);

		int check = ps.executeUpdate();

		if (check > 0) {
			System.out.println("Data deleted successfully...");
		} else {
			System.err.println("Data is not deleted..");
		}

		c.close();
	}

	public void getalledata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root",
				"root");
		System.out.println("Connection is OK...");

		PreparedStatement ps = c.prepareStatement("Select * from studentclass ");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt("id");
			String name = rs.getString("name");

			System.out.println(id + " " + name);
		}

		c.close();
	}

}
