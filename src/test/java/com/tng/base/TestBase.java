package com.tng.base;

import org.testng.annotations.BeforeSuite;

public class TestBase {
	@BeforeSuite
	public void setUp() {
		System.out.println("Initializing");
	}

}
