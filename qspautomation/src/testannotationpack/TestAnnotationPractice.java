package testannotationpack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationPractice {
  @Test
  public void method1()
  {
	  Reporter.log("Test Annotation in Method1", true);
  }
  @Test
  public void method8()
  {
	  Reporter.log("Test Annotation in Method8", true);
  }
  
  @BeforeClass
  public void method2()
  {
	  Reporter.log("Before Class Annotation in Method2", true);
  }
  @BeforeMethod
  public void method3()
  {
	  Reporter.log("Before Method Annotation in Method3", true);
  }
  @BeforeTest
  public void method4()
  {
	  Reporter.log("Before test Annotation in Method4", true);
  }
  @AfterClass
  public void method5()
  {
	  Reporter.log("After Class Annotation in Method5", true);
  }
  @AfterMethod
  public void method6()
  {
	  Reporter.log("After Method Annotation in Method6", true);
  }
  @AfterTest
  public void method7()
  {
	  Reporter.log("After test Annotation in Method7", true);
  }
  @Test
  public void method9()
  {
	  Reporter.log("Test Annotation in Method9", true);
  }
}
