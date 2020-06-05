package com.tng.tests;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.tng.base.TestBase;


public class SkipThisTest extends TestBase  {

	@Test(priority = 100)
	public void skipThisTest() {

		System.out.println("Inside Skip THis Test P100");
		Reporter.log("Inside Skip THis Test P100");
		throw new SkipException("skipMessage");
	}
}
