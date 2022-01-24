package com.java.s1.start;

import java.util.List;
import java.util.Locale;

import com.java.s1.department.DepartmentController;
import com.java.s1.department.DepartmentDAO;
import com.java.s1.department.DepartmentDTO;
import com.java.s1.department.DepartmentView;
import com.java.s1.location.LocationDAO;
import com.java.s1.location.LocationDTO;
import com.java.s1.location.LocationView;
import com.java.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
		
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentView departmentView = new DepartmentView();
		DepartmentController departmentController = new DepartmentController();
		
		FrontController frontController = new FrontController();
		
		try {
//			DepartmentDTO departmentDTO = new DepartmentDTO();
//			departmentDTO.setDepartment_id(20);
//			departmentDTO = departmentDAO.getOne(departmentDTO);
//			DepartmentDTO departmentDTO = departmentDAO.getOne(20);
//			System.out.println(departmentDTO.getDepartment_name());
//			List<DepartmentDTO> arr = departmentDAO.getList();
//			departmentView.view(arr);
			
			frontController.mainStart();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		LocationDAO locationDAO = new LocationDAO();
//		LocationView locationView = new LocationView();
//		
//		try {
//			List<LocationDTO> arr = locationDAO.getList();
//			locationView.view(arr);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		System.out.println("DB 연동 테스트 끝");

	}

}
