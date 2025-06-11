package forMavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CampaignTest {
	@Test
	public void sampleTest() {
		WebDriver driver = new ChromeDriver();
		String URL = System.getProperty("url");
		//String UNAME = System.getProperty("username");
		//String PWD = System.getProperty("password");
		System.out.println("URL is : "+URL);
		//System.out.println("username is : "+UNAME);
		//System.out.println("password is : "+PWD);
		
		driver.get(URL);
	}

}
