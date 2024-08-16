package verificationUsingTestNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawBack 
{
  @Test
  public void f()
  {
	  String a = "Pune";
	  String b = "Mumbai";
	  
	  Assert.assertEquals(a, b,"a and b not equal,TC failed");
	  Assert.assertNotNull(b,"b is null,TC is failed");
  }
}
