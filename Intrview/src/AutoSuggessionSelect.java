import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutoSuggessionSelect {
	
	@Test
	public void LinkPrint() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ama");
		
		List<WebElement> a =driver.findElements(By.xpath("//li[@class='sbct']"));
		
		for (WebElement b : a) {
			
			System.out.println("Values are = " + b.getText());
			
			if(b.getText().equalsIgnoreCase("amazon")) {
				
				b.click();
				
				break;
			}
			
		}
		
		
		
	
		
		
		
		
	}

}
