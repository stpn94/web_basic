package web_basic.erp.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JndiDs {
	private static DataSource ds;  
	static {   																//1이거 먼저 실행되고
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/dbstudy");
			System.out.println("ds:"+ ds);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private JndiDs() {} 													//2호출
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
