package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Message {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourn\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.id("u_0_d")).click();
		System.out.println("messENGER OPENED");
		//driver.findElement(By.xpath("//a[@href='https://www.facebook.com/messages/t/bharathgourneni']")).click();
		
		
		
		driver.findElement(By.xpath("//a[@href='/messages/new/']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='inputtext textInput']")));
	    
		//WebElement friendName = driver.findElement(By.xpath("//input[@class='inputtext textInput_5f0v']"));

		//friendName.sendKeys("");
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='user selected']")));
	    //friendName.sendKeys(Keys.ENTER);
	}
}
