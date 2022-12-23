package Login_prg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezon{
	public static void main(String[] args) {
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdulnashim Shaikh\\Desktop\\MY DOC\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   //Open Url
		driver.get("https://www.amazon.in/");
		
		//Enter Username
		driver.findElement(By.id("ap_email")).sendKeys("");
		
		//click on continue
		driver.findElement(By.id("continue")).click();
		
		//Enter Password
		driver.findElement(By.id("ap_password")).sendKeys("");
		// click on sign in
		driver.findElement(By.id("signInSubmit")).click();
		
		//find search box
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		// search
		searchbox.sendKeys("Books");
		
		// search submit
		searchbox.submit();
		
		         
		
		
		
	}
}
