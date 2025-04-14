package ex02_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {
	public List<Person> find() {
		List<Person> list = new ArrayList<Person>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM PERSON";

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Person p = new Person();
				p.setIDX(rs.getInt("IDX"));
				p.setNAME(rs.getString("NAME"));
				p.setAGE(rs.getInt("AGE"));

				list.add(p);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
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
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//PERSON테이블에 데이터를 추가하는 ADD메서드
	
	public void add(int num,String name,int age) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO PERSON VALUES ";
		
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Person p = new Person();
				p.getIDX();
				p.getNAME();
				p.getAGE();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
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
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	
}
