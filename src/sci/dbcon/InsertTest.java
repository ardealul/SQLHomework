package sci.dbcon;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

class InsertTest {

	@Test
	void test() throws SQLException {
		Statement stmt = null;
		Connection connection = DBUtil.getConnection(DBType.PostgreSQL);
		if(connection == null){
			System.out.println("No connection");
			}else {System.out.println("Connection exists");}
		connection.setAutoCommit(false);
	      stmt =connection.createStatement();
	         /*String sql = "INSERT INTO accomodation (ID,TYPE,BED_TYPE,MAX_GUESTS,DESCRIPTION) "
	            + "VALUES (2,'One Room', 'solo',1, 'good room' );";
	         stmt.executeUpdate(sql);
	         stmt.close();*/
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM accomodation;" );
	         while ( rs.next() ) {
	             int id = rs.getInt("id");
	             String  type = rs.getString("TYPE");
	             String bedType  = rs.getString("BED_TYPE");
	             int  maxGuests = rs.getInt("MAX_GUESTS");
	             String description = rs.getString("DESCRIPTION");
	             System.out.println( "ID = " + id );
	             System.out.println( "type = " + type );
	             System.out.println( "bed_type = " + bedType );
	             System.out.println( "MAX GUESTS = " + maxGuests );
	             System.out.println( "Description = " + description );
	             System.out.println();
	          }
	          rs.close();
	         connection.commit();
	         connection.close();
	         
	}

}
