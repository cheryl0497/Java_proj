import java.sql.*;

public class JDBC {
	static final String JDBC_DRIVER ="oracle.jdbc.OracleDriver";  
    static final String DB_URL ="jdbc:oracle:thin:@//localhost/xe";
    //static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";  
    //static final String DB_URL ="jdbc:mysql://localhost/cdac";

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(JDBC_DRIVER);
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		int no, dno;
		double sal;
		String name;
		try {
			conn = DriverManager.getConnection(DB_URL, "cdac", "cdac");
			stmt = conn.createStatement();
			String sql = "select empno, ename, sal, deptno from emp";
		
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				no = rs.getInt("empno");
				dno = rs.getInt(3);
				name = rs.getString("ename");
				sal = rs.getDouble("sal");
				System.out.printf("%d\t%s\t%.2f\t%d%n", no, name, sal, dno );
			}
			rs.close();
			stmt.close();
			conn.close();
		
		}catch(SQLException ex) {
			ex.printStackTrace();	
				}
		catch(Exception e) {
			e.printStackTrace();	
		
		}
		finally
		{
			try { 
				if (rs != null)
					rs.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();	
				
			}
			try { 
				if (stmt != null)
					stmt.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();	
					
			}
			try { 
				if (conn != null)
					conn.close();
			}
			catch(SQLException ex) {
				ex.printStackTrace();	
				
			}
			
		}
	}

}