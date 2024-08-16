package verificationUsingTestNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserStudy 
{
  @Test
  public void myTest() 
  {
	  String a = "Pune";
	  String b = "Mumbai";
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(a, b,"a and b are not equals,TC is failed");
	  soft.assertNull(a,"a is not null,TC is failed");
	  soft.assertAll();
  }
  
  @Test
  public void myTest1()
  {
	  boolean x = true;
	  SoftAssert soft = new SoftAssert();
	  soft.assertFalse(x,"x is true,TC is failed");
	  soft.assertAll();
  }
}
