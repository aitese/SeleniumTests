import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ukstaging.staexperiences.com/");
		WebElement searchBox;
		searchBox = driver.findElement(By.id("txtSearch"));
		searchBox.sendKeys("asi");
		Select dropdown = new Select(driver.findElement(By.id("ui-id-2")));
	}

}
