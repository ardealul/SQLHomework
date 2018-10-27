package sci.dbcon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			Connection connection = DBUtil.getConnection(DBType.PostgreSQL);
			if(connection == null){
				System.out.println("No connection");
				}else {System.out.println("Connection exists");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
