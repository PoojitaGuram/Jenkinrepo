package com.poo123;

import org.testng.annotations.Test;

public class Jenkin2test {
	@Test(groups = "smoke")
	public void jtest() {
		System.out.println("hi hello");
	}
	@Test(groups = "regression")
	public void htest() {
		System.out.println("poo");
		
	}
}
