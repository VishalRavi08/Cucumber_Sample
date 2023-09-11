package org.pro.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order = 2)
	public void preCondition1() {
		System.out.println("preCondition1");
		
	}
	
	@Before(order = 22, value = "@regression")
	public void preCondition2() {
		System.out.println("preCondition2");
	}

	@Before(order = 12)
	public void preCondition3() {
		System.out.println("preCondition3");
	}

	@After(order = 112)
	public void postCondition1() {
		System.out.println("postCondition1");

	}

	@After(order = 5, value = "@smoke")
	public void postCondition2() {
		System.out.println("postCondition2");

	}

	@After(order = 15)
	public void postCondition3() {
		System.out.println("postCondition3");
	}

}
