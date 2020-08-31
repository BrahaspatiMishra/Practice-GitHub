package stepDefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class code {

	public static List<String> mostActive(List<String> customers) {
	    // Write your code here
	        int size = customers.size();
	        double percentageToBeTolerated = (size * 0.05);
	        System.out.println(percentageToBeTolerated);
	        Map<String, Integer> mapOfTrades = new HashMap<String, Integer>();
	        List<String> sortedList = new ArrayList<String>();
	        for(String a:customers){
	            int abc = 1;
	            if(mapOfTrades.containsKey(a)){
	                mapOfTrades.put(a, mapOfTrades.get(a) + 1);
	            }else{
	                mapOfTrades.put(a, abc);
	            }
	        }
	        for(String cust: customers){
	            if(mapOfTrades.get(cust) >= percentageToBeTolerated){
	            	if(!sortedList.contains(cust))
	            		sortedList.add(cust);
	            }
	        }
	        Collections.sort(sortedList);
	    return sortedList;
	}
	
	public static void main(String[] args) {
		List<String> customers = new ArrayList<String>();
		String[] array = {"Omega","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Alpha","Omega","Beta"};
		for(String abs : array) {
			customers.add(abs);
		}
		System.out.println(code.mostActive(customers));
	}
	
}
