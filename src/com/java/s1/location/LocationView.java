package com.java.s1.location;

import java.util.ArrayList;
import java.util.List;

public class LocationView {
	
	public void view(LocationDTO locationDTO) {
		System.out.print(locationDTO.getLocation_id() + "\t");
		System.out.print(locationDTO.getStreet_address() + "\t");
		System.out.print(locationDTO.getPostal_code() + "\t");
		System.out.print(locationDTO.getCity() + "\t");
		System.out.print(locationDTO.getState_province() + "\t");
		System.out.println(locationDTO.getCountry_id());
		System.out.println("------------------------------------------------------------------");
		
	}
	
	public void view(List<LocationDTO> arr) {
		for(int i=0;i<arr.size();i++) {
			this.view(arr.get(i));
			System.out.println("------------------------------------------------------------------");
		}
	}
	
}
