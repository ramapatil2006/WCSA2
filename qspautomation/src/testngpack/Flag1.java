package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "This is the ActiTime valid login test")
  public void ValidLogin() {
  Reporter.log("ActiTime login Successful",true);
  }
  
}
