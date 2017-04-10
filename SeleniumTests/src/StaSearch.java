import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaSearch {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Selenium/drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/Selenium/drivers/geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//ImplicitWait(driver);
		driver.get("http://ukstaging.staexperiences.com/");
		//WebElement searchBox;
		WebElement link;
		
		//searchBox = driver.findElement(By.id("txtSearch"));
		//searchBox.sendKeys("asi");
		
		driver.findElement(By.className("btn-primary")).click();
		
		ExplicitTextWait(driver, "Uncover India–Delhi to Goa");
		
		link = driver.findElement(By.linkText("Uncover India–Delhi to Goa"));
		link.click();
		
		ExplicitLinkWait(driver, "btn-sta btn-primary btn-book");
		
		//searchBox.submit();
		
		driver.quit();
	}
	
	/*public static void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
	public static void ExplicitTextWait(WebDriver driver, String text) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText(text)));
	}
	
	public static void ExplicitLinkWait(WebDriver driver, String text) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.className(text)));
	}
	

}
