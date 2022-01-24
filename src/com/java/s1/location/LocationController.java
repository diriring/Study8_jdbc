package com.java.s1.location;

import java.util.List;
import java.util.Scanner;


public class LocationController {
	
	private LocationDAO locationDAO;
	private LocationView locationView;
	private Scanner sc;
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationView = new LocationView();
		sc = new Scanner(System.in);
	}
	
	public void start() throws Exception {
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 지역 리스트 출력");
			System.out.println("2. 지역 번호 검색");
			System.out.println("3. 나가기");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				List<LocationDTO> arr = locationDAO.getList();
				locationView.view(arr);
				break;
			case 2:
				System.out.println("검색할 지역 번호를 입력");
				LocationDTO locationDTO = new LocationDTO();
				locationDTO.setLocation_id(sc.nextInt());
				locationDTO = locationDAO.getOne(locationDTO);
				locationView.view(locationDTO);
				break;
			default :
				flag = false;
				break;
			
			}
		}
		
	}

}
