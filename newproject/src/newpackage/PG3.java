// movie names list program

package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.ListeningExecutorService;

public class PG3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourn\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.fandango.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/98004_movieTimes']")).click();

		System.out.println("Test 1");

		Select nbyTheaters = new Select(driver.findElement(By.className("nearby-theaters__select")));
		System.out.println("Test 2");
		nbyTheaters.selectByVisibleText("Cinemark Lincoln Square");
		System.out.println("Test Passed!");

		// driver.get("http://www.redbus.in/Booking/SelectBus.aspx?fromCityId=124&fromCityName=Hyderabad&toCityId=462&toCityName=Mumbai&doj=30-May-2013&busType=Any&opId=0");

		// Find's the elements using a CSS selector: all td's (with class "i1"),
		// directly inside a tr (with class r1) which are inside a table.
		List<WebElement> linkElements = driver.findElements(By.className("fd-movie"));
		String[] linksText = new String[linkElements.size()];
		int index = 0;
		//String movieNameAppended = null;
		for (WebElement element : linkElements) {
			 linksText[index++] = element.findElement(By.className("fd-movie__details"))
					.findElement(By.cssSelector(".fd-movie__title.font-sans-serif.font-lg.font-300.uppercase"))
					.findElement(By.className("dark")).getText();
			 
			//movieNameAppended += linksText[--index]+"  /" ;
		}
		//System.out.println(movieNameAppended);
		
		for (String text : linksText) {
			System.out.println(text);
		}
		driver.get("https://www.facebook.com/bharathgourneni");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//a[@action='cancel']")).click();	
		System.out.println("passed");
//		driver.findElement(By.id("u_0_d")).click();
//		System.out.println("messENGER OPENED");
//		driver.findElement(By.xpath("//a[@href='/messages/new/']")).click();
//		
		driver.get("https://www.facebook.com/bharathgourneni");
		driver.findElement(By.xpath("//a[@href='/messages/t/bharathgourneni/']")).click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//div[contains(@class,'_5rpu') and @role='combobox']"));
		for (String text : linksText) {
		System.out.println(text);
		
		//a.sendKeys(text+Keys.ENTER);
		}
		//Thread.sleep(10000);
		//a.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	
		
		
		// close Fire fox
	 driver.close();
	

}
}
