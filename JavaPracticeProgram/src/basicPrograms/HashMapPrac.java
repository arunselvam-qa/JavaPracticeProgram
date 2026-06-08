package basicPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapPrac {

	public static void main(String[] args) {

//		HashMap<String, String> hp = new HashMap<String, String>();
//		hp.put("Arun", "Selenium");
//		hp.put("Arun", "Java");
//		
//		System.out.println(hp.entrySet());
		
		HashMap<String, List<String>> hp1 = new HashMap<>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Selenium");
		al.add("Playwright");
		al.add("Java");
		hp1.put("Arun", al);
		
		System.out.println(hp1.entrySet());

	}

}
