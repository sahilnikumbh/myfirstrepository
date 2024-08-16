package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemo {
  @Test
  public void f() 
  {
	  System.out.println("This is test NG Class");
	  Reporter.log("Sahil",true);
  }
  
  @Test
  public void m3()
  {
	  Reporter.log("Velocity",false);
  }
}
