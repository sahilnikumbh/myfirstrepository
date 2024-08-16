package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest 
{
  @Test(invocationCount = 4)
  public void mytest() 
  {
	  Reporter.log("My test is running",true);
  }
}
