package verificationUsingTestNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse 
{
  @Test
  public void f() 
  {
	  boolean a = true;
	  boolean b = false;
	  
	  //Assert.assertTrue(a,"value is false,TC is failed");
	  
	  Assert.assertFalse(a,"value is true,TC is failed");
  }
}


