package omayoproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class omayo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Laxmi Jadhav\\Documents\\TESTING\\Automation Testing\\Browser Extension\\chromedriver.exe\\");
         WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(5000);
		Select s;
		s=new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[3]/div[1]/select")));
	s.selectByIndex(3);
	Thread.sleep(2000);
	//multiple options
	//s=new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[2]/div[1]/select")));
	//s.selectByIndex(1);
	//s.selectByIndex(2);
	//s.selectByIndex(3);
	//s.selectByIndex(4);
	//Thread.sleep(2000);
	//blogs
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("SeleniumByArun")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
	//add text area
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/textarea")).sendKeys("welcome to selenium");
	Thread.sleep(2000);
	//search this blog
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SELENIUM:");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[2]/input")).click();
	Thread.sleep(2000);
	//radio female
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[3]/div[1]/input[2]")).click();
	Thread.sleep(2000);
	
	//location text
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[10]/div[1]/input")).sendKeys("Location is Karnataka");
	Thread.sleep(2000);
	//login
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[5]/div[1]/form/input[1]")).sendKeys("User123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[5]/div[1]/form/input[2]")).sendKeys("12345");
	Thread.sleep(2000);
	
	//textbox with preloaded text
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[7]/div[1]/input")).clear();
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[7]/div[1]/input")).sendKeys("Changed value");
	//enablebutton
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[9]/div[1]/button")).click();
	Thread.sleep(2000);
		
	//iframe
	//driver.findElement(By.xpath("//*[@id=\"HTML21\"]"));
	//selenium143link
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[5]/div[1]/a")).click();
		Thread.sleep(2000);
		//what is selenium
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div[2]/div[1]/table/tbody/tr/td[1]/ol/li[1]/b/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//multiple options
		s=new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[2]/div[1]/select")));
		s.selectByIndex(1);
		Thread.sleep(3000);
	//timerenablebutton
		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[19]/div[1]/input")).click();
		//Thread.sleep(2000);
		//System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(3000);
	//click after text disappear
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[15]/div[1]/input")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//get confirmation
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[8]/div[1]/input")).click();
		//driver.switchTo().alert().sendKeys("get confirmation code");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	
		//getprompt
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[7]/div[1]/input")).click();
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("selenium");
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(2000);
		
		//clickgetalert
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[4]/div[1]/input")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//open popup window
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[17]/div[1]/p/a")).click();
				Thread.sleep(4000);
		driver.close();
	}

}