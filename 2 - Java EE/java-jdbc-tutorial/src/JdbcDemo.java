import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/world";
		String user = "root";
		String pass = "root";
		
		try {
			
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("SELECT * FROM city");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("Name") + ": " + myRs.getString("CountryCode"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
