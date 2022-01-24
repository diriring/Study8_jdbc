package com.java.s1.start;

import com.java.s1.employee.EmployeeController;
import com.java.s1.employee.EmployeeDAO;
import com.java.s1.employee.EmployeeView;
import com.java.s1.location.LocationController;

public class TestMain {

	public static void main(String[] args) {
		
		LocationController locationController = new LocationController();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		EmployeeController employeeController = new EmployeeController();
		EmployeeView employeeView = new EmployeeView();
		
		try {
			locationController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
