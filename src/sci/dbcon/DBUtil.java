package sci.dbcon;
	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "cursjava123";
	private static final String HOST = "localhost";

	public static Connection getConnection(DBType dbType) throws SQLException {
		Connection connection = null;
		switch (dbType) {
		case MYSQL:
			connection = null;
			break;
		case ORACLE:
			connection = null;
			break;
		case PostgreSQL:
			String url = new StringBuilder()
			.append("jdbc:")
			.append(dbType.toString().toLowerCase())
			.append("://")
			.append(HOST)
			.append(":")
			.append(5432)
			.append("/")
			.append("booking")
			.append("?user=")
			.append(USERNAME)
			.append("&password=")
			.append(PASSWORD).toString();
			connection = (Connection) DriverManager.getConnection(url);
		}
		return connection;
	}
	 private static void loadDriver() {
	        try {
	            Class.forName("org.postgresql.Driver").newInstance();
	        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	            System.err.println("Can't load driver. Verify CLASSPATH");
	            System.err.println(e.getMessage());
	        }

	    }
}
