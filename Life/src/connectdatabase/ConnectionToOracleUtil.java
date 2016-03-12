package connectdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionToOracleUtil {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {

		ConnectionToOracleFactory ctf = new ConnectionToOracleFactory();
		
		Connection conn = ctf.getConnectToOracle().getConnection();
		
		PreparedStatement ps = conn.prepareStatement("  SELECT ENAME FROM EMP ");//执行一天语句
		
		//返回查询结果集
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println("ename = "+rs.getString("ename")); 
		}
	}

}
