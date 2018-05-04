package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PG2{
	 public static void main(String[] args) {
		 // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\gourn\\Downloads\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gourn\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	       String baseUrl = "https://www.fandango.com/";
	        

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        //WebElement City = driver.findElement(By.id("global-search"));	
	       // WebElement s=driver.findElement(By.xpath("//input[@placeholder='Enter City + State, ZIP Code, or Movie']"));
	        //s.sendKeys("bellevue WA");		
	        
	        //System.out.println("Test 1");
	       // driver.findElement(By.className("fan-btn fan-btn-style-go")).click();
	        
	       // driver.findElement(By.xpath("//input[@button class = 'fan-btn fan-btn-style-go']")).click();
	        //By id = By.id("local-movies-link");
	        //WebDriverWait wait = new WebDriverWait(driver, 50);

	        //wait.until(ExpectedConditions.invisibilityOfElementLocated(id));
	        //driver.findElement(id).click();
	        // WebElement s=driver.findElement(By.xpath("//input[@placeholder='City, State or Zip Code']"));
	       //s.clear();
	        //s.sendKeys("bellevue,WA");
	        //driver.findElement(By.id("local-movies-link")).click();
	        
	        //driver.findElement(By.id("local-movies-link")).submit();			
	        driver.findElement(By.xpath("//a[@href='/98004_movieTimes']")).click();
	        
	        System.out.println("Test 1");
	        
	        
	        Select nbyTheaters = new Select(driver.findElement(By.className("nearby-theaters__select")));
	        System.out.println("Test 2");
	        nbyTheaters.selectByVisibleText("Cinemark Lincoln Square");
	        System.out.println("Test Passed!");


	        //close Fire fox
	       //driver.close();
	       
	    }

	}


