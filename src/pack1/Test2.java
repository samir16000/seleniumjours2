package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // une instance du navigateur chrome
		// ChromeDriver driver2 = new ChromeDriver (); driver2 de type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // maximiser l'affichage de la fenetre
		//WebElement username = driver.findElement(By.id("txtUsername"));
		//username.sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
