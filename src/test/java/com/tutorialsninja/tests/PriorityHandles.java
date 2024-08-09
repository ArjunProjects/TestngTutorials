package com.tutorialsninja.tests;

import org.testng.annotations.Test;

public class PriorityHandles {
	
	/*
	 * if no priority was given for one of the test(and other tests have declared priority) then by default it will take priority=0 and this will execute first
	 * we can provide negative priority also(eg: priority=-1) and this will execute first(before priority=0)
	 * we can provide duplicate priority also, in this case execution will be based on the alphabetical order
	 */
	
	@Test(priority=1)
	public void sampleOne() {
		System.out.println("sampleOne method");
	}
	@Test(priority=-4)
	public void sampleTwo() {
		System.out.println("sampleTwo method");
	}
	@Test(priority=-1)
	public void sampleThree() {
		System.out.println("sampleThree method");
	}
	@Test(priority=2)
	public void sampleFour() {
		System.out.println("sampleFour method");
	}
	@Test()
	public void sampleFive() {
		System.out.println("sampleFive method");
	}

}
