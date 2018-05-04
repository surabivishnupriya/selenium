package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class PG1 {
	 public static void main(String[] args) {
		 // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\gourn\\Downloads\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gourn\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	       String baseUrl = "https://www.facebook.com/";
	        String expectedTitle = "Google";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        WebElement email = driver.findElement(By.id("email"));		
	        WebElement password = driver.findElement(By.name("pass"));							

	        email.sendKeys("@gmail.com");					
	        password.sendKeys("");					
	        				
	        //login.click();			
	        

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	       driver.findElement(By.id("loginbutton")).click();;
	       System.out.println("Login Done with Click");	
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	            System.out.println("Test Passed!");
	      
	       
	        //close Fire fox
	       // driver.close();
	       
	    }

	}


