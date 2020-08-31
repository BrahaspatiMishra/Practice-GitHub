package stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class code2 {

	static boolean isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        return status;
    }  
	
	public static void main(String[] args) {
		String[] dictionary = {"heater", "cold", "clod", "reheat", "docl"};
		String[] query = {"codl", "heater", "abcd"};
		List<Integer> finalAnswer = new ArrayList<Integer>();
		Map<String,Integer> newMap = new LinkedHashMap<String, Integer>();
		for(String querywise: query) {
			for(String dictwise:dictionary) {
				if(code2.isAnagram(querywise, dictwise)) {
					if(newMap.containsKey(querywise)) {
						newMap.put(querywise, newMap.get(querywise)+1);
					}else {
						newMap.put(querywise, 1);
					}
				}
			}
			if(!newMap.containsKey(querywise)) {
				newMap.put(querywise, 0);
			}
		}
		for(String key:newMap.keySet()) {
			finalAnswer.add(newMap.get(key));
			
		}
		System.out.println(finalAnswer);
	}
}
