package com.tng.tests;

import org.testng.annotations.Test;

import com.tng.base.TestBase;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;


public class TestClass1 extends TestBase  {

	@Test(priority = 1)
	public void TestCase1() {
		assertTrue(true);
		// Assert.fail("Somehow Failed");
		System.out.println("TestCase1 complete P1");
		Reporter.log("TestCase1 complete P1");
	}
}
