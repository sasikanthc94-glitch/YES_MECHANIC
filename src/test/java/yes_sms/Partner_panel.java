package yes_sms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Partner_panel {
	
	
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

		driver.get("https://sms-partnerpannel.netlify.app/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("secondpartner123@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Secondpartner@123");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='absolute top-2.5 right-3 text-gray-500 cursor-pointer']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		Thread.sleep(3000);



	}



	@Test

	public void dashboardpage() throws Exception {

		driver.findElement(By.xpath("//a[@href='/']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//select[@aria-label='Select period']")).click();

		Thread.sleep(5000);

	}



	@Test

	public void spareparts() throws Exception {

		// step 2 : click on spare parts 

		driver.findElement(By.xpath("//a[@href='/spare-parts']//div[@class='text-xl']")).click();

		Thread.sleep(5000);

		// Step 3 : Add category 

		driver.findElement(By.xpath("//button[normalize-space()='Add category']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter category name']")).sendKeys("ALLOY WHEEL");

		Thread.sleep(5000);	

		driver.findElement(By.xpath("//button[normalize-space()='Add Category']")).click();

		Thread.sleep(5000);

		// step 4 : Add  new Product  

		driver.findElement(By.xpath("//button[normalize-space()='Add New Product']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter product name']")).sendKeys("ALLOYS");

		Thread.sleep(5000);	

		driver.findElement(By.xpath("//input[@placeholder='Enter image URL']")).sendKeys("istockphoto.com/photos/alloy-wheel");

		Thread.sleep(5000);	

		driver.findElement(By.xpath("//input[@placeholder='Enter price']")).sendKeys("11");

		Thread.sleep(5000);	

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/main/div/div/div[7]/div/div[1]/div[5]/select")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[6]//select[1]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter brand']")).sendKeys("kia");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='e.g., 6 months']")).sendKeys("7");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(@class,'px-6 py-2 bg-[#7812A4] text-white rounded-full transition disabled:bg-gray-400 disabled:cursor-not-allowed')]")).click();

		Thread.sleep(5000);

		

	}

	@Test

	public void jobcars() throws Exception {

		// Step 5: Click on jobcards

		driver.findElement(By.xpath("//a[@href='/bookings']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@class,'flex items-center gap-2')]")).click();

		Thread.sleep(2000);

		

	}

	@Test

	public void serviceRequest() throws Exception {

		//Step 5: click on Service Request and create jobcard 

		driver.findElement(By.xpath("//a[@href='/service']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Customer name']")).sendKeys("Ravi");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Chennai");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Address 2']")).sendKeys("Adayar");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Contact No']")).sendKeys("9865325698");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ravi@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[5]//div[1]//label[1]//input[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[contains(@class,'w-full md:w-48 p-3 border-2 border-gray-300 rounded-full !text-black transition-all')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter registration number']")).sendKeys("852852852852");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter vehicle model']")).sendKeys("SONET");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter engine number']")).sendKeys("STM4578545151685");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter mileage']")).sendKeys("22");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter vehicle color']")).sendKeys("BLACK");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter chassis number']")).sendKeys("HMT45484518484");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("11/11/2011");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@placeholder='Describe the action to be taken...']")).sendKeys("WORK NOT COMPLETED SOON");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='space-y-8']//div[2]//div[1]//div[2]//div[1]//div[2]//div[1]//input[1]")).sendKeys("alloy wheel");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='space-y-8']//div[2]//div[1]//div[2]//div[1]//div[2]//div[2]//input[1]")).sendKeys("4");

	    Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='space-y-4']//div[1]//div[2]//div[3]//input[1]")).sendKeys("11");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Add Item']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Service description']")).sendKeys("change alloy");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[2]//div[2]//input[1]]")).sendKeys("40000");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='flex justify-between items-center']")).sendKeys("40000");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(5000);

			

	}

	@Test

	public void servicrcatlogue () throws Exception {

		// click on service catlogue

		driver.findElement(By.xpath("//span[normalize-space()='Service Catlogue']")).click();

		Thread.sleep(2000);

		// click and add category

		driver.findElement(By.xpath("//span[normalize-space()='Add Category']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter category name']")).sendKeys("car parts");

		Thread.sleep(5000);

		// click on add service and enter service details 

		driver.findElement(By.xpath("//button[@class='flex items-center space-x-2 px-4 py-2 bg-[#7812A4] !text-white rounded-3xl hover:bg-[#7812A4] transition-colors']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Enter service name']")).sendKeys("general");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter price']")).sendKeys("5000");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='e.g., 30 min']")).sendKeys(" 60 min");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@placeholder='Enter service description']")).sendKeys("general service and service parts");

		Thread.sleep(5000);

	}

	@Test

	public void Billing () throws Exception {

		// click on billing and check the history of billing

		driver.findElement(By.xpath("//a[@href='/Billing']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='border bg-[#7812AA] p-3 rounded-2xl text-white']")).click();

		Thread.sleep(2000);

	}

	@Test

	public void Announcement () throws Exception {

		// click on announcement

		driver.findElement(By.xpath("//li[normalize-space()='All']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='General']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='Offeres']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='Services']")).click();

		Thread.sleep(2000);

	}

	@Test

	public void Enquiry() throws Exception {

		// click on Enquiry

		driver.findElement(By.xpath("//a[@href='/enquiry-page']")).click();

		Thread.sleep(2000);

		// Fill enquiry form

		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("RAGU");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9645127825");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@placeholder='Describe your issue or question...']")).sendKeys("RAGU");

		// Click submit

		Thread.sleep(5000);driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		

		

	}

	@Test

	public void Notification() throws Exception {

		driver.findElement(By.xpath("//a[@href='/notifications']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Unread']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Read']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[normalize-space()='Winter offer']")).click();

		Thread.sleep(2000);

		

	}

	@Test

	public void Search() throws Exception {

		//click on search bar Enter the detail and search

		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("RAGU");

		// click on search 

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		

	}
		

	}



