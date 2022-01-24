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
	
	//부서 번호로 조회하는 메서드
	public DepartmentDTO getOne(DepartmentDTO dep) throws Exception {
		DepartmentDTO departmentDTO = null;
		//1. DB 로그인
		Connection con = dbConnector.getConnect();
		//2. Query문 작성
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ? ";
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 값을 세팅
		//st.setInt(int index, 값);
		//index는 ?의 순서번호
		//oracle은 index 1번부터 시작
		st.setInt(1, dep.getDepartment_id());
		//5. 최종 전송 후 결과값 처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			//데이터가 있을 때
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
		}
		//칼럼명은 내가 별칭을 지었거나 연산을 하여 이름이 바뀐 경우 바뀐 이름을 적어줘야한다
		//칼럼을 불러올 땐 칼럼 명칭으로 불러오거나 인덱스를 사용하여(ex. 1번째 칼럼, 2번째 칼럼 ...) 불러올 수 있음 
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
		
		return departmentDTO;
		
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
