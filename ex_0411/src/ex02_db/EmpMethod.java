package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	public List<Emp> find(String job){
		List<Emp> list = new ArrayList<Emp>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT empno, ename, job, sal from emp where job= ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//첫번째 물음표 자리에 매개변수로 들어온 job값으로 채워라
			pstmt.setString(1, job);
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				 Emp e = new Emp();
				 e.setEmpno(rs.getInt("empno"));
				 e.setEname(rs.getString("ename"));
				 e.setJob(rs.getString("job"));
				 e.setSalary(rs.getInt("sal"));
				 
				 list.add(e);
			}

		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception

			}
		}
		return list;
	}
}
