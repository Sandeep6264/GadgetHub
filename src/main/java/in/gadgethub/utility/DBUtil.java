package in.gadgethub.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBUtil {
	private static Connection conn;
	public static  void openConnection(String driver,String url,String userName,String password) {

		if(conn==null) {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);
			System.out.println("GadGetHub Connection opened !");
		}catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Error in opening connection ");
			ex.printStackTrace();
		}
		}

	}
	public static void closeConnection() {
		if(conn!=null) {
		try {
			conn.close();
			System.out.println("Connection closed successfully");
		}catch(SQLException ex) {
			System.out.println("Error in connection close");
			ex.printStackTrace();
		}
		}
	}
	public static Connection provideConnnection() {
			return conn;
	}
	public static void closeResultSet(ResultSet rs) {
		if(rs!=null) {
		try {
			rs.close();
		}catch(SQLException ex) {
			System.out.println("Error is closing ResultSet");
			ex.printStackTrace();
		}
		}
	}
	public static void closeStatement(Statement stmt) {
		if(stmt!=null) {
		try {
			stmt.close();
		}catch(SQLException ex) {
			System.out.println("Error is closing Statement");
			ex.printStackTrace();
		}
		}
	}
}
