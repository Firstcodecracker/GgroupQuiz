package GgroupQuiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReturnConnection {
	
	Connection connection  = null;
	
	public Connection retConnection() throws SQLException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Project", "root", "root");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
