package TestNGListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngListenersDemo.class)

public class TestCases {
				

	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{		
		System.out.println("Login");			
	}		

	// Forcefully failed ths test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    		
	}	
}
