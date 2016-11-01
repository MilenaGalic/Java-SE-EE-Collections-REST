import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchemaInfoDemoAdvanced {
	
	public static void main(String[] args) throws SQLException {
		
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String columnNamePattern = null;
		String[] types = null;
		
		Connection myConn = null;
		ResultSet myRs = null;
		ResultSet myRsColumns = null;
		
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
				String currentTable = myRs.getString("TABLE_NAME");
				
				// 4. Get a list of columns
				System.out.println("\nList of Columns in " + currentTable );
				System.out.println("-----------------");
				
				myRsColumns = databaseMetaData.getColumns(catalog, schemaPattern,  currentTable , columnNamePattern);
				
				while (myRsColumns.next()) {
					System.out.println(myRsColumns.getString("COLUMN_NAME") + "(" + myRsColumns.getString("TYPE_NAME") + "), size = " + myRsColumns.getInt("COLUMN_SIZE"));
				}
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
