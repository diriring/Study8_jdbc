package com.java.s1.employee;

import java.util.List;

public class EmployeeView {
	
	public void view(EmployeeDTO employeeDTO) {
		
		System.out.print(employeeDTO.getEmployee_id() + "\t");
		System.out.println(employeeDTO.getFirst_name() + "\t");
		System.out.println(employeeDTO.getLast_name() + "\t");
		System.out.println(employeeDTO.getEmail() + "\t");
		System.out.println(employeeDTO.getPhone_number() + "\t");
		System.out.println(employeeDTO.getHire_date() + "\t");
		System.out.println(employeeDTO.getJob_id() + "\t");
		System.out.println(employeeDTO.getSalary() + "\t");
		System.out.println(employeeDTO.getCommission_pct() + "\t");
		System.out.println(employeeDTO.getManager_id() + "\t");
		System.out.println(employeeDTO.getDepartment_id() + "\t");
		System.out.println("-------------------------------------------------------");
		
	}
	
	public void view(List<EmployeeDTO> arr) {
		for(int i=0;i<arr.size();i++) {
			this.view(arr.get(i));
		}
	}

}
