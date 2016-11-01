import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPreparedStatementDemo {
	
	static void display(ResultSet rs) throws SQLException {
		while(rs.next()) {
			System.out.println(rs.getObject(1) + ", " + rs.getObject(2));
		}
	}
	
	public static void main(String[] args) {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			
			// 2. Prepare a statement
			myStmt = myConn.prepareStatement("select * from country where Code = ?");
			
			// 3. Set the parameters
			myStmt.setString(1, "ROS");
			
			// 4. Execute SQL query
			myRs = myStmt.executeQuery();
			
			// 5. Display the result set
			display(myRs);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
