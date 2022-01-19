package com.java.s1.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java.s1.util.DBConnector;

public class DepartmentDAO {
	//DAO : Data Access Object
	DBConnector dbConnector;
	public DepartmentDAO() {
		dbConnector = new DBConnector();
	}
	
	public List<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> arr = new ArrayList<>();
		
		//SELECT * FROM DEPARTMENTS;
		
		//1.DB 로그인
		Connection con = dbConnector.getConnect();
		
		//2.SQL Query 문 작성
		//Java에서는 query 문 끝의 ;을 빼준다
		String sql = "SELECT * FROM DEPARTMENTS";
		
		//3.작성한 SQL Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.? 값을 세팅, 없으면 생략
		
		//5.최종전송
		ResultSet rs = st.executeQuery();
		
		//cursor가 한 줄 읽는 메서드 next() return은 데이터가 있으면 true, 없으면 false
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
			
			arr.add(departmentDTO);
		}
		
		//6.외부 연결 해제
		//연결된 순서의 역순
		rs.close();
		st.close();
		con.close();
		
		return arr;
	}
	

}
