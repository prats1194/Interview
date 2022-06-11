package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.Status;

import TestBase.initialize;

public class Listeners extends initialize implements IListeners {

	public void onFinish(ITestContext result) {

		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	// After test fail execution comes to this block
		// name of test which got failed send as parameter to your screenshot file

		WebDriver driver=null;
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}  catch (Exception e) {
					}
	
		
	String testMethodName =	result.getMethod().getMethodName();
	try {
		getScreenshotPath(testMethodName, driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestStart(ITestResult result) {
		// this block will execute before actually execution of test starts.
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// end of each test on success.
		
	}

	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}


	
//	Listeners Interfaces provide testng listeneres	
	//To implement interface use keyword interface
	

}
