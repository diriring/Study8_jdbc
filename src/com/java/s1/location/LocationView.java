package com.java.s1.location;

import java.util.ArrayList;
import java.util.List;

public class LocationView {
	
	public void view(List<LocationDTO> arr) {
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i).getLocation_id() + "\t");
			System.out.print(arr.get(i).getStreet_address() + "\t");
			System.out.print(arr.get(i).getPostal_code() + "\t");
			System.out.print(arr.get(i).getCity() + "\t");
			System.out.print(arr.get(i).getState_province() + "\t");
			System.out.println(arr.get(i).getCountry_id());
			System.out.println("------------------------------------------------------------------");
		}
	}
	
}
