package ex02_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpSelect {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int salary = rs.getInt("sal");

				System.out.printf("사번 : %d | 이름 : %s | 직무 : %s | 급여 : %d \n", empno, ename, job, salary);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception

			}
		}
	}

}
