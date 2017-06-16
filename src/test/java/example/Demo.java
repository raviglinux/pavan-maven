package example;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@Test
	  public void f() {
		  System.out.println("before test");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  String term = "hello";
		  Assert.assertEquals("hello", term);
		  System.out.println("Finallyyyyyyyyyyyyyyyy");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }
}
