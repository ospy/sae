package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		conn = DBPool.getInstance().getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "select * from news";
//		System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
