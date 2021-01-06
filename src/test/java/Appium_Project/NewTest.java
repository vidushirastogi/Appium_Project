package Appium_Project;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
	public AndroidDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Hii");
	  driver.get("https://magento.com/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[@class='nav-menu-button js-menu-button visible-xs visible-sm']")).click();
	  driver.findElement(By.xpath("//*[@id='block-header']/u1/li[8]/a")).click();
	  driver.findElement(By.xpath("//u1[@class='menu menu-level-1']/li.div/div[2]/p[2]/a")).click();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2500)");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("ABC");
	  driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("XYZ");
	  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ABC@gmail.com");
	  driver.findElement(By.xpath("//*[@id='Phone']")).sendKeys("1234567890");
	  WebElement e1 = driver.findElement(By.xpath("//*[@id='Country']"));
	  Select se =new Select (e1);
	  se.selectByVisibleText("India");
	  WebElement e2 = driver.findElement(By.xpath("//*[@id='Job_Role__c']"));
	  Select se1 =new Select (e2);
	  se1.selectByVisibleText("Developers");
	  driver.findElement(By.xpath("//*[@name='Company']")).sendKeys("IBM");
	  WebElement e3 = driver.findElement(By.xpath("//*[@id='Organizational_Role__c']"));
	  Select se2 =new Select (e3);
	  se2.selectByVisibleText("Technology or Solution Provider");
	  WebElement e4 = driver.findElement(By.xpath("//*[@id='MktoPersonNotes']"));
	  Select se3 =new Select (e4);
	  se3.selectByVisibleText("I am gathering information for a client");
	  driver.findElement(By.xpath("//button[@class ='mktoButton']")).click();
	  WebElement e5= driver.findElement(By.xpath("//div[@class='js-step-thank-you step-thank-you']"));
	  e5.getText();
	  System.out.println("Thank you");
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities capability= new DesiredCapabilities();
      capability.setCapability("deviceName", "Vidushi");
      capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
      capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.magapp.main");
      capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.magapp.main.LoginActivity");
      driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
  }

  @AfterClass
  public void afterClass() {
  }

}
