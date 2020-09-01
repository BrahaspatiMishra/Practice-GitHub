package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

public class code3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void getValue(List<ArrayList<String>> customer) {
		//customer.get(0).stream().filter(k -> k.split("likes")).sorted().forEach(System.out::print);
		customer.get(0).stream().map(k -> k.split("likes")[0].trim()+k.split("likes")[1].trim()).forEach(System.out::println);
		//System.out.println(customer);
	}
	
	
	public static void main(String[] args) {
		testData("naash kardo sab");
	}

	private static void testData(String message) {
		List<ArrayList<String>> customer = new ArrayList<>();
		ArrayList<String> toBeAdded = new ArrayList<>();
		toBeAdded.add("abc likes cds");
		String e = "123 likes asd";
		toBeAdded.add(e);
		toBeAdded.add("cds likes abc");
		toBeAdded.add("asd likes 123");
		toBeAdded.add("koiNahi likes karan");
		customer.add(toBeAdded);
		code3.getValue(customer);
		System.out.println(message);
	}
}