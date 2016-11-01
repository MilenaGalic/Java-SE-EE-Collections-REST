import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {
	
	public static void main(String[] args) throws SQLException {
		
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
			
			// 3. Insert a new country
			System.out.println("Inserting a new country");
			
			int rowsAffected = myStmt.executeUpdate(
				"insert into country " + 
				"(Code, Name, Continent, Region) " +
				"values " +
				"('ROS','Republic of Srpska','Europe','Balkan')");
			
			System.out.println("Rows affected: " + rowsAffected);
			
			// 4. Verify this by getting a list of towns
			myRs = myStmt.executeQuery("select * from country");
			
			// 5. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("Name") + ": " + myRs.getString("Continent"));
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}
		}
		
	}

}
