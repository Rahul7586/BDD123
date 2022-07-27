package ListenerTestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListenerDemo.class)
public class TestCases {
	@Test(priority=1)
	public void login() {
		System.out.println("Login method");
	}
	
	@Test(priority=2)
	public void exit() {
		System.out.println("Exit method");
	}
}
