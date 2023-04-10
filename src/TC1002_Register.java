import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC1002_Register {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://www.classmarker.com/register/");
		
		driver.findElement(By.xpath("//*[@id=\"features-box\"]/div/div[1]/div[1]/h4/a")).click();

		driver.findElement(By.xpath("//*[@id=\"serialid\"]")).sendKeys("12341234124124");
		driver.findElement(By.xpath("//*[@id=\"firstid\"]")).sendKeys("Niti");
		driver.findElement(By.xpath("//*[@id=\"lastid\"]")).sendKeys("Surakongka");
		driver.findElement(By.xpath("//*[@id=\"checkUsername\"]")).sendKeys("eexrth");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("niti2003s");
		Thread.sleep(1000);
																													
		String result = driver.findElement(By.xpath("//*[@id=\"errDivcheckUsername\"]")).getText();
        assertEquals("This username is available.",result);
        
		driver.quit();
        driver = null;

	}
}
