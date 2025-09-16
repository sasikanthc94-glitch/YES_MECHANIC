package yes_sms;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_panel {
	WebDriver driver;

	@BeforeTest

	public void InitialiseBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win32\\chromedriver-win32Chromedriver.exe");
      

	}


	@Test

	public void LoginPage() throws Exception {

		// Step1 : login with valid credentials 
			driver.get("https://sms-userpanel.netlify.app/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/header/div[2]/div[5]/div[3]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("9748232597");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);
            String otpText = driver.findElement(By.xpath("//*[@id='root']/div[1]/div/main/div/div/div/form/div/div[1]/p"))
    				.getText();
    		Thread.sleep(3000);

    		String otp = otpText.replaceAll("\\D+", ""); // keep only digits
    		System.out.println("Fetched OTP: " + otp);

    		// Enter each digit into OTP input boxes
    		for (int i = 0; i < otp.length(); i++) {
    			driver.findElement(
    					By.xpath("//*[@id='root']/div[1]/div/main/div/div/div/form/div/div[2]/input[" + (i + 1) + "]"))
    					.sendKeys(String.valueOf(otp.charAt(i)));
    			Thread.sleep(5000);
    		}
    		driver.findElement(By.xpath("//button[normalize-space()='Verify OTP']")).click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("//button[@class='focus:outline-none']")).click();
        	Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[@href='/profile']")).click();
    		Thread.sleep(3000);
    		// Update a car Details 
    		driver.findElement(By.xpath("//button[normalize-space()='CAR DETAILS']")).click();
    		Thread.sleep(3000);
    		//button[normalize-space()='ADD ANOTHER CAR']
    		driver.findElement(By.xpath("//button[normalize-space()='ADD ANOTHER CAR']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//input[@placeholder='Car Registration No']")).sendKeys("TN05BR1525");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@placeholder='Car Model']")).sendKeys("520 d");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@placeholder='Car Company']")).sendKeys("BMW");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@placeholder='Car Year']")).sendKeys("2025");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@placeholder='Car Fuel Type']")).sendKeys("PETROL");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
    		Thread.sleep(3000);
    		//Add a service 
    		driver.findElement(By.xpath("//a[@href='/services']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[@href='/booking-cart']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[@href='/spare-parts']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//a[@href='/booking-cart']")).click();
    		Thread.sleep(3000);
    
    		driver.findElement(By.xpath("//button[normalize-space()='SparePart Orders']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		Thread.sleep(3000);
    		
    		
    		
    		
    		
    		  

    		
		}
	}

