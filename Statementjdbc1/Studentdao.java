package Statementjdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Studentdao {

	public void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/student";

  		Connection c = DriverManager.getConnection(url, "root", "root");

		Statement s = c.createStatement();
		
		if(c != null) {
			System.out.println("database connected.....");
		}
		
		s.executeUpdate("insert into studentclass(id, name, city) values (1, 'ashutosh','pune'),(2,'aniket','lonavla'),(3,'yash','pimpri');");
		System.out.println("insert Query Executed!");
		
		c.close();
		s.close();

	}

	public void update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/student";

  		Connection c = DriverManager.getConnection(url, "root", "root");

		Statement s = c.createStatement();
		
		if(c != null) {
			System.out.println("database connected.....");
		}
		
		s.executeUpdate("update studentclass SET name = 'jack', city = 'chakan' where id = 1;");
		System.out.println("update Query Executed!");
		
		c.close();
		s.close();
		
	}

	public void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/student";

  		Connection c = DriverManager.getConnection(url, "root", "root");

		Statement s = c.createStatement();
		
		if(c != null) {
			System.out.println("database connected.....");
		}
		
		s.executeUpdate("delete from studentclass where id = 1;");
		System.out.println("delete Query Executed!");
		
		c.close();
		s.close();
}
}
