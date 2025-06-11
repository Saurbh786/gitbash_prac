package forMavenTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeTest")
	public void createContactTest() {
		Reporter.log("Contact Created Successfully", true);
	}
	@Test(groups = "RegressionTest")
	public void modifyContactTest() {
		Reporter.log("Contact Modified Successfully", true);
	}

}
