package practice.java;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ITestListenerDemo  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println( "Execution started in class "+result.getClass().getSimpleName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		
	}
	
	/*
	 * public void takeScreenShot(String methodName, WebDriver driver) { File
	 * scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //The
	 * below method will save the screen shot in d drive with test method name try {
	 * FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
	 * System.out.println("***Placed screen shot in "+filePath+" ***"); } catch
	 * (IOException e) { e.printStackTrace(); } }
	 */

}
