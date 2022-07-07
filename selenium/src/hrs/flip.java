package hrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 11");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@href='/Redmi-Horizon-Qualcomm%C2%AE-SnapdragonTM-Included/dp/B09QSBXK96/ref=sr_1_1?keywords=redmi+note+11&qid=1654794930&sprefix=redmi%2Caps%2C544&sr=8-1'])[2]")).click();
  
}
}
