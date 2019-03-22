package extentReport;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;

public class ExtentReport<LogStatus> implements IReporter {

	private ExtentReports extent;
	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1, String arg2) {
		
		
	}
	
	
	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
}





