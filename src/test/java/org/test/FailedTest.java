package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
@Test
public void tc1() {
	System.out.println("tc1");
}
@Test
public void tc2() {
	Assert.assertTrue(false);
	System.out.println("tc2");
}
@Test
public void tc3() {
	System.out.println("tc3");
}
@Test
public void tc4() {
	System.out.println("tc4");
}
}
