import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC1001_Register {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://www.classmarker.com/register/");
		
		String result = driver.findElement(By.xpath("//*[@id=\"features-box\"]/div/div[1]/div[1]/h3")).getText();
        assertEquals("Students",result);
		
		driver.findElement(By.xpath("//*[@id=\"features-box\"]/div/div[1]/div[1]/h4/a")).click();

		Thread.sleep(1000);
		driver.quit();
        driver = null;

	}
}
