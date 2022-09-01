package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled = true)
  public void ValidActLogin() {
	  Reporter.log("ActiTime login successful", true);
  }
}
