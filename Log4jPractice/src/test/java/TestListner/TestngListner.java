package TestListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListner implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		System.out.println("***Test Start***"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("***Success****"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TestFial"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result)
	{
        System.out.println("on skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Failed but with in sccesspercentage"+result.getName());

	}

	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("**on failed with Time out***"+result.getName());

	}

	public void onStart(ITestContext context)
	{
		System.out.println("**onStart***"+context.getName());

	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("**on Finish**"+context.getName());

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	

}
