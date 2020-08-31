package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@Smoke")
	public void hookMethod() {
		System.out.println("this is hook");
	}
}
