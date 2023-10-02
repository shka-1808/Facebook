package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  Reporter.log("opening ajio", true);
		  driver.get("https://www.facebook.com/");
		  driver.manage().deleteAllCookies();
		  //Assert.fail();
		  Thread.sleep(7000);
		  driver.close();

	}

}
