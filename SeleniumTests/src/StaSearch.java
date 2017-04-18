import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/Selenium/drivers/geckodriver.exe");
		
		WebDriver driverCH = new ChromeDriver();
		WebDriver driverFF = new FirefoxDriver();
		ImplicitWait(driverCH);
		ImplicitWait(driverFF);
		driverCH.get("http://ukstaging.staexperiences.com/");
		driverFF.get("http://ukstaging.staexperiences.com/");
		//WebElement searchBox;
		WebElement link;
		
		//searchBox = driver.findElement(By.id("txtSearch"));
		//searchBox.sendKeys("asi");
		
		driverCH.findElement(By.className("btn-primary")).click();
		driverFF.findElement(By.className("btn-primary")).click();
		ExplicitTextWait(driverCH, "Uncover India–Delhi to Goa");
		ExplicitTextWait(driverFF, "Uncover India–Delhi to Goa");
		link = driverCH.findElement(By.linkText("Uncover India–Delhi to Goa"));
		link = driverFF.findElement(By.linkText("Uncover India–Delhi to Goa"));
		link.click();
		
		ExplicitLinkWait(driverCH, "btn-sta btn-primary btn-book");
		ExplicitLinkWait(driverFF, "btn-sta btn-primary btn-book");
		
		//searchBox.submit();
		
		driverCH.quit();
		driverFF.quit();
	}
	
	public static void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void ExplicitTextWait(WebDriver driver, String text) {
		(new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.linkText(text)));
	}
	
	public static void ExplicitLinkWait(WebDriver driver, String text) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.className(text)));
	}
	

}
