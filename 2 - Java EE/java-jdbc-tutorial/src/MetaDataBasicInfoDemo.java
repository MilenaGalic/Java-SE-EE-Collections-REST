import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaDataBasicInfoDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection myConn = null;
		
		try {
			
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
			
			// 2. Get metadata
			DatabaseMetaData databaseMetaData = myConn.getMetaData();
			
			// 3. Display info about database
			System.out.println("Product name: " + databaseMetaData.getDatabaseProductName());
			System.out.println("Product version: " + databaseMetaData.getDatabaseProductVersion());
			
			// 4. Display info about JDBC driver
			System.out.println("JDBC Driver name: " + databaseMetaData.getDriverName());
			System.out.println("JDBC Driver version: " + databaseMetaData.getDriverVersion());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			myConn.close();
		}
	}
}
