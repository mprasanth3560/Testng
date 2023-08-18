package org.git;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3)
	private void tc01() {
		System.out.println("Test1");
		
	}
	
	@Test(priority = 5)
	private void tc02() {
		System.out.println("Test2");
		
	}
	
	@Test(priority = 2 , invocationCount = 5)
	private void tc03() {
		System.out.println("Test3");
		
	}
	
	@Test(priority = -3)
	private void tc04() {
		System.out.println("Test4");
		
	}
	
	@Test(priority = 4)
	private void tc05() {
		System.out.println("Test5");
		
	}


}
