import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\unzipped\\\\chromedriver_win32_77\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://www.demo.guru99.com/V4/";
		
		driver.navigate().to(URL);
		System.out.println("Navigating to" + driver.getTitle());
		
		if(!URL.equals(driver.getCurrentUrl()))
		{
			System.out.println("URL is not correct and hence closing the browser");
			driver.quit();
		}
		else
		{
			WebElement username = driver.findElement(By.name("uid"));
			WebElement password = driver.findElement(By.name("password"));
			WebElement loginbutton = driver.findElement(By.name("btnLogin"));
			
			username.sendKeys("mngr225908");
			password.sendKeys("evynUme");
			loginbutton.click();
			System.out.println(driver.switchTo().alert().getText());
			//driver.close();
		}
			
		
				

	}

}
