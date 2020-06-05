package com.tng.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tng.base.TestBase;


public class AnotherTest extends TestBase {
	@Test(priority = 20)
	public void anotherTest() {
		System.out.println("Another Test P20");
		Reporter.log("Another Test P20");
	}
}
