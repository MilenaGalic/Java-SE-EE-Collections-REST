import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchemaInfoDemo {
	
	public static void main(String[] args) throws SQLException {
		
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String columnNamePattern = null;
		String[] types = null;
		
		Connection myConn = null;
		ResultSet myRs = null;
		
		try {
			
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
			
			// 2. Get metadata
			DatabaseMetaData databaseMetaData = myConn.getMetaData();
			
			// 3. Get a list of tables
			System.out.println("List of Tables");
			System.out.println("==============");
			
			myRs = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern, types);
			
			while(myRs.next()) {
				System.out.println(myRs.getString("TABLE_NAME"));
			}
			
			// 4. Get a list of columns
			System.out.println("\n\nList of Columns");
			System.out.println("-----------------");
			
			myRs = databaseMetaData.getColumns(catalog, schemaPattern, "city", columnNamePattern);
			
			while (myRs.next()) {
				System.out.println(myRs.getString("COLUMN_NAME"));
			}
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			myConn.close();
		}
	}

}
