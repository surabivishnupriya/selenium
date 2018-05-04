package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\gourn\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			 driver.findElement(By.partialLinkText("Sign in")).click();
			 driver.findElement(By.id("ap_email")).sendKeys("@gmail.com"+Keys.ENTER + ""+Keys.ENTER);
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("instant pot" + Keys.ENTER );
			 Thread.sleep(2000);
driver.findElement(By.partialLinkText("ekovana Stackable Stainless Steel Pressure Cooker Steamer Insert Pans - Instant Pot in Pot Accessories - Fits 5,6 & 8 qt instant pot")).click();
	
	driver.findElement(By.id("add-to-cart-button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("siNoCoverage-announce")).click();;
	
	driver.findElement(By.id("hlb-view-cart-announce")).click();
	
	driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	driver.findElement(By.id("dropdown1_0")).click();
	System.out.println("clicked");
	//Select quantity=new Select(driver.findElement(By.className("a-dropdown-link")));
  //Select qua =new Select(quantity);
  //qua.selectByVisibleText("1");
  Thread.sleep(1000);
  driver.findElement(By.id("sc-buy-box-ptc-button")).click();
  driver.get("https://www.facebook.com/bharathgourneni");
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("");
	driver.findElement(By.id("loginbutton")).click();
	driver.findElement(By.xpath("//a[@action='cancel']")).click();	
	System.out.println("passed");
	driver.get("https://www.facebook.com/bharathgourneni");
	driver.findElement(By.xpath("//a[@href='/messages/t/bharathgourneni/']")).click();
	Thread.sleep(2000);
	WebElement a=driver.findElement(By.xpath("//div[contains(@class,'_5rpu') and @role='combobox']"));
	String v="ekovana Stackable Stainless Steel Pressure Cooker Steamer Insert Pans - Instant Pot in Pot Accessories - Fits 5,6 & 8 qt instant pot";
	a.sendKeys(v + "please enter shipping address to complete the order");
	Thread.sleep(1000);
	
	//a.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
  System.out.println("Entered shippment");
  driver.close();
  
  
	

	
	
}
}
	