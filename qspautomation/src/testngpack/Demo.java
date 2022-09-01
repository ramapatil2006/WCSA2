package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() 
  {
	  //The message can be display on console only
	  System.out.println("Hi! I am from method a using System.out.println");
	  
	//The message can be display on report only
	  Reporter.log("Hi! I am from method a Using reporter"); 
	  
	//The message can be display on both report and console.
	  Reporter.log("Hi! I am from method a using reporter",true);  
  }
  

}
