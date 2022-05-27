package com.labs.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

//		List<String> cities = getCities();
//		if (cities !=null)
//		System.out.println(cities.get(0));
//		
		//System.out.println(getCity());
//		
//		List<String> cities1 = getcities().get();
//		System.out.println(cities1.get(0));
//					
//		if(getcities().isPresent()) {
//			List<String> cities2= getcities().get();
//			if(cities2 !=null) {
//				System.out.println(cities2.get(0));
//			}
//		}
//		
		
//		Optional<List<String>> cities3 = getcities().or(() -> Optional.of(Arrays.asList("Orissa","Gujarat","Noida")));
//		System.out.println(cities3);
//		
		//getcities().orElseThrow(RuntimeException::new);
				
		//getcities().ifPresentOrElse(System.out::println, null);
		
		Optional<List<String>> filteredcities = getcities().filter(item->item.contains("Delhi"));
		System.out.println(filteredcities);
		
		
		//String city = getcity().isPresent() ? getcity().get() : getcity().orElse("Mumbai");
		String city = getcity().orElse("Pune");
		//String city = getcity().orElse("");
		//System.out.println(getcity().isPresent() ? getcity().get() : "");
		//System.out.println(city);
		
		
//		cities.get(0);
	
	}

	private static List<String> getCities() {
		//return Arrays.asList("Bangalore", "Mumbai", "Delhi", "Pune");
		return null;
	}
	
	private static Optional<List<String>> getcities() {
		//return Arrays.asList("Bangalore", "Mumbai", "Delhi", "Pune");
		//Optional<List<String>> cities = Optional.of(Arrays.asList("Bangalore", "Mumbai", "Delhi", "Pune"));
		Optional<List<String>> cities = Optional.empty();
		return cities;
		//return null;
	}
	
	private static String getCity() {
		return "Bangalore";
		//return null;
	}
	
	
	//with Optional keyward
	private static Optional<String> getcity() {
		Optional<String> city = Optional.of("Bengaluru");
		//Optional<String> city = Optional.ofNullable(null);
		//Optional<String> city = Optional.empty();
		return city;
	}
	

}
