package ListenerTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerDemo implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test exe successfully "+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test finished ");
	}
}
