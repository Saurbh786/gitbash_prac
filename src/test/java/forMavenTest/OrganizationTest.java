package forMavenTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups = "SmokeTest")
	public void createOrgTest() {
		Reporter.log("Organization Created Successfully", true);
	}
	@Test(groups = "RegressionTest")
	public void modifyOrgTest() {
		Reporter.log("Organization Modified Successfully", true);
	}

}
