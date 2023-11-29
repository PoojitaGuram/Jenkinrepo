package com.poo123;

import org.testng.annotations.Test;

public class JenkinTest {
@Test(groups = "smoke")
public void demotest() {
	System.out.println("hi hello");
}
@Test(groups = "regression")
public void demo1test() {
	System.out.println("poo");
}
}
